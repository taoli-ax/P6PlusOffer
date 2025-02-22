package day1.code.strategy;

import day1.code.Elevator;
import day1.code.ExternalRequest;

import java.util.List;

public interface HandleRequestStrategy {
    public void handleRequest(ExternalRequest request, List<Elevator> elevators);
}
