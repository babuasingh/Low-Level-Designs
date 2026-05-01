package Elevator_Management_System;

import Elevator_Management_System.StrategyDesign.ElevatorSelectionStrategy;
import Elevator_Management_System.StrategyDesign.NearestElevatorStrategy;
import Elevator_Management_System.entities.Elevator;
import Elevator_Management_System.entities.Request;
import Elevator_Management_System.enums.Direction;
import Elevator_Management_System.enums.RequestType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ElevatorService {
    private Map<Integer, Elevator> elevatorMap = new HashMap<>();
    private static ElevatorService elevatorService;
    private ElevatorSelectionStrategy elevatorSelectionStrategy;
    private ExecutorService executorService;


    private ElevatorService(int noOfElevators) {
        for (int i = 1; i <= noOfElevators; i++) {
            Elevator elevator = new Elevator(i);
            elevatorMap.put(i, elevator);
        }
        elevatorSelectionStrategy = new NearestElevatorStrategy(); // as of now we can go with this , more strategies include based on load , noOfPeoples etc .
        executorService = Executors.newFixedThreadPool(noOfElevators);
    }

    public static ElevatorService getInstance(int noOfElevators) {
        if (elevatorService == null) {
            synchronized (ElevatorService.class) {
                if (elevatorService == null) {
                    elevatorService = new ElevatorService(noOfElevators);
                }
                return elevatorService;
            }
        }
        return elevatorService;
    }


    //External request
    public void requestElevator(int floorNo, Direction direction) {
        Request request = new Request(RequestType.EXTERNAL, floorNo, direction);
        Elevator elevator = elevatorSelectionStrategy.getElevatorByStrategy(request, new ArrayList<>(elevatorMap.values()));
        elevator.processRequest(request);
    }

    //internal request
    public void selectFloor(int elevatorNo, int floorNo) {
        Request request = new Request(RequestType.INTERNAL, floorNo, null); // for internal request direction doesn't matter
        Elevator elevator = elevatorMap.get(elevatorNo);
        elevator.processRequest(request);
    }

    public void startSystem() {
        for (Elevator elevator : elevatorMap.values()) {
            executorService.submit(elevator);
        }
    }

}