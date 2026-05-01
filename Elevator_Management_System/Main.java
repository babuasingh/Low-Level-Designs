package Elevator_Management_System;

import Elevator_Management_System.enums.Direction;

 // Ignore the driver class as of now.

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int noOfElevators = 3;
        ElevatorService elevatorManagementSystem = ElevatorService.getInstance(noOfElevators);

        elevatorManagementSystem.startSystem();

        //hall request
        elevatorManagementSystem.requestElevator(2, Direction.DOWN);
        Thread.sleep(2000);

        //internal request
        elevatorManagementSystem.selectFloor(1, 10);
        Thread.sleep(200);

        elevatorManagementSystem.requestElevator(3, Direction.DOWN);
        Thread.sleep(300);

        // 4. Internal Request: User in E2 presses 1.
        elevatorManagementSystem.selectFloor(2, 1);

        Thread.sleep(1000);


    }
}
