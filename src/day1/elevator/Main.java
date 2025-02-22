package day1.elevator;

import day1.elevator.strategy.RandomHandleRequestStrategy;

public class Main {
    public static void main(String[] args) {
        ElevatorSystem elevatorSystem = new ElevatorSystem();
        elevatorSystem.setStrategy(new RandomHandleRequestStrategy());
        ExternalRequest request = new ExternalRequest();
        elevatorSystem.handleRequest(request);

    }
}
