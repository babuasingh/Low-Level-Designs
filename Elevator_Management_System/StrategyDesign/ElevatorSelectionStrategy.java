package Elevator_Management_System.StrategyDesign;

import Elevator_Management_System.entities.Elevator;
import Elevator_Management_System.entities.Request;

import java.util.List;

public interface ElevatorSelectionStrategy {
    Elevator getElevatorByStrategy(Request request, List<Elevator> elevators);
}
