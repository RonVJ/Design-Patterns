package DesignPatterns.Prototype;

public class IntelligentStudent extends Student{
    private int iq;

    public void setIq(int iq) {
        this.iq = iq;
    }

    public int getIq() {
        return iq;
    }

    public IntelligentStudent(IntelligentStudent other) {
        super(other);
        this.iq = other.iq;
    }

    public IntelligentStudent() {
        iq = 104;
    }

    public IntelligentStudent copy() {
        return new IntelligentStudent(this);
    }
}
