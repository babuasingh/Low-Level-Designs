package Elevator_Management_System.StateDesign;

import Elevator_Management_System.entities.Elevator;
import Elevator_Management_System.entities.Request;
import Elevator_Management_System.enums.Direction;
import Elevator_Management_System.enums.RequestType;

public class MovingUpState implements ElevatorState {
    @Override
    public void move(Elevator elevator) {
        if(elevator.getUpFloors().isEmpty()){
            elevator.setElevatorState(new IdleState());
            return;
        }
        elevator.setFloor(elevator.getFloor()+1);
        elevator.notifyObservers();
        if(elevator.getFloor() == elevator.getUpFloors().first()){
            elevator.getUpFloors().pollFirst();
        }
    }

    @Override
    public void addRequest(Elevator elevator, Request request) {
        if (request.getRequestType() == RequestType.INTERNAL) {
            if (request.getTargetFloor() > elevator.getFloor()) {
                elevator.getUpFloors().add(request.getTargetFloor());
            } else {
                elevator.getDownFloors().add(request.getTargetFloor());
            }
        } else { //External Request
            if (request.getDirection() == Direction.UP && request.getTargetFloor() > elevator.getFloor()) {
                elevator.getUpFloors().add(request.getTargetFloor());
            } else if (request.getDirection() == Direction.DOWN) {
                elevator.getDownFloors().add(request.getTargetFloor());
            }
        }
    }

    @Override
    public Direction getDirection() {
        return Direction.UP;
    }
}
