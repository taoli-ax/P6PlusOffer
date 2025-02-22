package day1.code.strategy;

import day1.code.Elevator;
import day1.code.ExternalRequest;
import day1.code.Request;

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
