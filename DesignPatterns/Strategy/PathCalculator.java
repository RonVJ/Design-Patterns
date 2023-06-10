package DesignPatterns.Strategy;

public interface PathCalculator {
    String getType();
    int calculatePath(int from, int to);
}
