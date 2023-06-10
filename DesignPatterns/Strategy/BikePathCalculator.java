package DesignPatterns.Strategy;

public class BikePathCalculator implements PathCalculator {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BikePathCalculator() {
        this.type = "BIKE";
    }


    public int calculatePath(int from, int to) {
        return 3;
    }
}
