package day1.code.strategy;

import day1.code.Elevator;
import day1.code.ExternalRequest;
import day1.code.Request;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.List;

public class NormalHourHandleRequestStrategy implements HandleRequestStrategy {
    @Override
    public void handleRequest(ExternalRequest request, List<Elevator> elevators) {
        System.out.println("NormalHourHandleRequestStrategy");
    }
}
