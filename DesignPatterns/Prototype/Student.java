package DesignPatterns.Prototype;

public class Student {
    private String name;
    private int age;
    private String gender;

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    private String batchName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Student(Student other) {
        this.name = other.getName();
        this.age = other.getAge();
        this.gender = other.getGender();
        this.batchName = other.getBatchName();
    }

    public Student() {
        age = 25;
        name = "Amit";
        batchName = "Apr 21 Eve Advanced";
        gender = "male";
    }



    public Student copy() {
        return new Student(this);
    }

}
