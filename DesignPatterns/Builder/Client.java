package DesignPatterns.Builder;

public class Client {
    public static void main(String[] args) throws Exception {
        Student student = Student.getBuilder().setAge(16).setPsp(84).build();
        student.setName("Arjun");
        student.setEmail("arjun_kumar@gmail.com");
        System.out.println(student.getName() + " is enrolled having age " + student.getAge() + " and psp " + student.getPsp());
    }
}
