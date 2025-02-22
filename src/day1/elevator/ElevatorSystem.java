package day1.elevator;

import day1.elevator.strategy.HandleRequestStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElevatorSystem {
    /**
     * input: people/request
     * output: move to floor
     *
     *
     * core object: ElevatorSystem
     *              Elevator
     *              ElevatorButton
     *              Building
     *              Request
     *
     *
     * use case: 用户发送请求-->ElevatorSystem-->响应一部电梯Elevator-->用户点击ElevatorButton
     *     case  : ElevatorSystem 接受指定 handleRequest
     *             Elevator open gate
     *             Elevator close gate
     *             Elevator check weight
     *             Elevator 调度 take external/internal request
     *             ElevatorButton 按 press button
     *             Request: 任意输入
     *
     * classes: 画出类图或写出代码
     *
     * challenge/Correctness
     */
    private List<Elevator> elevators= new ArrayList<Elevator>(Arrays.asList(
            new Elevator(),
            new Elevator(),
            new Elevator(),
            new Elevator(),
            new Elevator()));
    private HandleRequestStrategy strategy;

    public void setStrategy(HandleRequestStrategy strategy) {
        this.strategy = strategy;
    }

    public void handleRequest(ExternalRequest request) {
        this.strategy.handleRequest(request, elevators);
    }



}
