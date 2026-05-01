package Elevator_Management_System.ObserverPattern;

import Elevator_Management_System.entities.Elevator;

public class ElevatorDisplay implements ElevatorObserver{
    @Override
    public void update(Elevator elevatore) {
        System.out.println(elevatore.getId() +" is currently at floor "+elevatore.getFloor() +" . Currently moving "+elevatore.getDirection());
    }
}
