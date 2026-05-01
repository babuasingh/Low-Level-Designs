package Elevator_Management_System.entities;

import Elevator_Management_System.ObserverPattern.ElevatorObserver;
import Elevator_Management_System.StateDesign.ElevatorState;
import Elevator_Management_System.StateDesign.IdleState;
import Elevator_Management_System.enums.Direction;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

public class Elevator implements Runnable {
    private int id;
    private AtomicInteger floor;
    private Direction direction;
    private ElevatorState elevatorState;
    private TreeSet<Integer> upFloors;
    private TreeSet<Integer> downFloors;
    List<ElevatorObserver> observers;

    private volatile boolean isRunning;

    public Elevator(int id) {
        this.id = id;
        floor=new AtomicInteger(0);
        direction = Direction.IDLE;
        elevatorState = new IdleState();
        upFloors = new TreeSet<>();
        downFloors = new TreeSet<>(Comparator.reverseOrder());
        observers = new ArrayList<>();
        isRunning = true;
    }

    public int getId() {
        return id;
    }

    public int getFloor() {
        return floor.get();
    }

    public void setFloor(int floor) {
        this.floor.set(floor);
    }

    public Direction getDirection() {
        return direction;
    }

    public ElevatorState getElevatorState() {
        return elevatorState;
    }

    public void setElevatorState(ElevatorState elevatorState) {
        this.elevatorState = elevatorState;
    }

    public TreeSet<Integer> getUpFloors() {
        return upFloors;
    }

    public TreeSet<Integer> getDownFloors() {
        return downFloors;
    }

    public void processRequest(Request request) {
        elevatorState.addRequest(this, request);
    }

    public void addObserver(ElevatorObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (ElevatorObserver observer : observers) {
            observer.update(this);
        }
    }

    public synchronized void stop() {
        isRunning = false;
    }

    @Override
    public void run() {
        while (isRunning) {
            elevatorState.move(this);
        }
    }
}
