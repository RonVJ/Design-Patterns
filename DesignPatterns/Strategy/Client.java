package DesignPatterns.Strategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        PathCalculator pathCalculator;
        pathCalculator = PathCalculatorFactory.getPathCalculatorFromEnum(TransportMode.BIKE);
        System.out.println("Transport mode: " + pathCalculator.getType() + ", calculated path is " + pathCalculator.calculatePath(1, 2));
        return;
    }
}
