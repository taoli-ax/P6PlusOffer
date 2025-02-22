package day1.elevator.strategy;

import day1.elevator.Elevator;
import day1.elevator.ExternalRequest;

import java.util.List;
import java.util.Random;

public class RandomHandleRequestStrategy implements HandleRequestStrategy {
    @Override
    public void handleRequest(ExternalRequest request, List<Elevator> elevators) {
        Random random = new Random();
        int n = random.nextInt(elevators.size());
        System.out.println("RandomHandleRequestStrategy Elevator:"+n);
        elevators.get(n).handleExternalRequest(request);
    }
}
