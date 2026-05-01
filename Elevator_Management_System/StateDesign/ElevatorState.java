package Elevator_Management_System.StateDesign;

import Elevator_Management_System.entities.Elevator;
import Elevator_Management_System.entities.Request;
import Elevator_Management_System.enums.Direction;

public interface ElevatorState {
    void move(Elevator elevator);
    void addRequest(Elevator elevator , Request request);
    Direction getDirection();
}
