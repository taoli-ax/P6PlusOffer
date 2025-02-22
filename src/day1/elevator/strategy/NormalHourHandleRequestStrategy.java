package day1.elevator.strategy;

import day1.elevator.Elevator;
import day1.elevator.ExternalRequest;

import java.util.List;

public class NormalHourHandleRequestStrategy implements HandleRequestStrategy {
    @Override
    public void handleRequest(ExternalRequest request, List<Elevator> elevators) {
        System.out.println("NormalHourHandleRequestStrategy");
    }
}
