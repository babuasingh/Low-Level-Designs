package Elevator_Management_System.StateDesign;

import Elevator_Management_System.entities.Elevator;
import Elevator_Management_System.entities.Request;
import Elevator_Management_System.enums.Direction;

public class IdleState implements ElevatorState {
    @Override
    public void move(Elevator elevator) {
        if(!elevator.getUpFloors().isEmpty()) {
            elevator.setElevatorState(new MovingUpState());
        } else if (!elevator.getDownFloors().isEmpty()) {
            elevator.setElevatorState(new MovingDownState());
        }
    }

    @Override
    public void addRequest(Elevator elevator, Request request) {
        if(request.getTargetFloor() > elevator.getFloor())
            elevator.getUpFloors().add(request.getTargetFloor());
        else elevator.getDownFloors().add(request.getTargetFloor());
    }

    @Override
    public Direction getDirection() {
        return Direction.IDLE;
    }
}
