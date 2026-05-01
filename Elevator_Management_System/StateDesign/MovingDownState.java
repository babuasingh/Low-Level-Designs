package Elevator_Management_System.StateDesign;

import Elevator_Management_System.entities.Elevator;
import Elevator_Management_System.entities.Request;
import Elevator_Management_System.enums.Direction;
import Elevator_Management_System.enums.RequestType;

public class MovingDownState implements ElevatorState {
    @Override
    public void move(Elevator elevator) {
        if(elevator.getDownFloors().isEmpty()){
            elevator.setElevatorState(new IdleState());
            return;
        }
        elevator.setFloor(elevator.getFloor()-1);
        elevator.notifyObservers();
        if(elevator.getDownFloors().first() == elevator.getFloor()){
            elevator.getDownFloors().pollFirst();
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

        } else { // external request

            if (request.getDirection() == Direction.DOWN && request.getTargetFloor() <= elevator.getFloor()) { // trying to go in the same way as elevator i.e down
                elevator.getDownFloors().add(request.getTargetFloor());
            } else {
                elevator.getUpFloors().add(request.getTargetFloor()); // wants to go UP .
            }

        }
    }

    @Override
    public Direction getDirection() {
        return Direction.DOWN;
    }
}
