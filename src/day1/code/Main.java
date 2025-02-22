package day1.code;

import day1.code.strategy.RandomHandleRequestStrategy;

public class Main {
    public static void main(String[] args) {
        ElevatorSystem elevatorSystem = new ElevatorSystem();
        elevatorSystem.setStrategy(new RandomHandleRequestStrategy());
        ExternalRequest request = new ExternalRequest();
        elevatorSystem.handleRequest(request);

    }
}
