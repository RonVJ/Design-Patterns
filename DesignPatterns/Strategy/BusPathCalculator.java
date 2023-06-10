package DesignPatterns.Strategy;

public class BusPathCalculator implements PathCalculator {
    private String type;
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BusPathCalculator() {
        this.type = "BUS";
    }

    public int calculatePath(int from, int to) {
        return 1;
    }

}
