package day1.elevator.strategy;

import day1.elevator.Elevator;
import day1.elevator.ExternalRequest;

import java.util.List;

public interface HandleRequestStrategy {
    public void handleRequest(ExternalRequest request, List<Elevator> elevators);
}
