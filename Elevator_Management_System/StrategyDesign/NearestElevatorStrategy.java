package Elevator_Management_System.StrategyDesign;

import Elevator_Management_System.entities.Elevator;
import Elevator_Management_System.entities.Request;
import Elevator_Management_System.enums.Direction;

import java.util.List;

public class NearestElevatorStrategy implements ElevatorSelectionStrategy {
    @Override
    public Elevator getElevatorByStrategy(Request request, List<Elevator> elevators) {
        Elevator finalelevator = null;
        int minDistance = Integer.MAX_VALUE;
        for (Elevator elevator : elevators) {
            if (isSuitable(elevator, request)) {
                if (minDistance > Math.abs(elevator.getFloor() - request.getTargetFloor())) {
                    minDistance = Math.abs(elevator.getFloor() - request.getTargetFloor());
                    finalelevator = elevator;
                }
            }
        }
        return finalelevator;
    }

    private boolean isSuitable(Elevator elevator, Request request) {
        if (elevator.getDirection() == Direction.IDLE)
            return true;

        if (elevator.getDirection() == Direction.UP && request.getTargetFloor() >= elevator.getFloor()) {
            return true;
        }
        if (elevator.getDirection() == Direction.DOWN && request.getTargetFloor() <= elevator.getFloor()) {
            return true;
        }
        return false;
    }

}
