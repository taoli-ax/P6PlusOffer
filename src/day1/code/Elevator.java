package day1.code;

import day1.code.strategy.HandleRequestStrategy;

import java.util.List;

public class Elevator implements Runnable {
    private List<ElevatorButton> buttons;
    private List<Integer> upStops;
    private List<Integer> downStops;
    private int currentLevel;
    private ElevatorStatus status;
    private float weightLimit;
    private boolean gateOpen;
    // 策略模式，一天之中有高峰和平常两种状态
    private HandleRequestStrategy strategy;

    public Elevator(List<Integer> upStops, List<Integer> downStops) {
        this.upStops = upStops;
        this.downStops = downStops;
    }

    public Elevator() {

    }

    public void handleExternalRequest(ExternalRequest externalRequest){

    }

    public void handleInternalRequest(InternalRequest request) {

    }

    public boolean isRequestValid(ExternalRequest externalRequest){
        return false;
    }

    public void openGate() {}
    public void closeGate() {}
    public float getCurrentWight(){
            return 100;
    }

    @Override
    public void run() {
        while (true) {
            if(!upStops.isEmpty() || !downStops.isEmpty()) {
                System.out.println("Up stops: " + upStops);
                System.out.println("Down stops: " + downStops);
            }else {
                Thread.yield();
            }
        }
    }
}
