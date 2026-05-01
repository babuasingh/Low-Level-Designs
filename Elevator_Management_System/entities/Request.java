package Elevator_Management_System.entities;

import Elevator_Management_System.enums.Direction;
import Elevator_Management_System.enums.RequestType;

public class Request {
    private RequestType requestType;
    private Direction direction; // in case it is external request (In hall you have 2 buttons for calling lift . Up one is if you want to go up and vice versa )
    private int targetFloor;

    public Request(RequestType requestType, int targetFloor,Direction direction) { //external and internal request both
        this.requestType = requestType;
        this.targetFloor = targetFloor;
    }


    public RequestType getRequestType() {
        return requestType;
    }

    public int getTargetFloor() {
        return targetFloor;
    }

    public Direction getDirection() {
        return direction;
    }
}
