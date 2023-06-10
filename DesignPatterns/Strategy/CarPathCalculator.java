package DesignPatterns.Strategy;

public class CarPathCalculator implements PathCalculator {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public CarPathCalculator() {
        this.type = "CAR";
    }
    public int calculatePath(int from, int to) {
        return 2;
    }
}
