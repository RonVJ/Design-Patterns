package DesignPatterns.Strategy;

public class PathCalculatorFactory {
    public static PathCalculator getPathCalculatorFromEnum (TransportMode mode) {
        return switch (mode) {
            case BUS -> new BusPathCalculator();
            case BIKE -> new BikePathCalculator();
            case CAR -> new CarPathCalculator();
        };
    }
}
