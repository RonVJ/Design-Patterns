package DesignPatterns.Prototype;

public class Client {
    public static void main(String[] args) {
        Student student, student1, student2;
        StudentRegistry studentRegistry = new StudentRegistry();




        student = new Student();
        student.setName("Pooja");
        student.setGender("FEMALE");
        student.setAge(24);
        student.setBatchName("oct 88 intermediate morning");

        studentRegistry.addStudent("Pooja", new Student(student));



        Student intelligentStudent = new IntelligentStudent();
        intelligentStudent.setName("Ruchit");
        intelligentStudent.setGender("MALE");
        intelligentStudent.setAge(88);
        intelligentStudent.setBatchName("sept 23 beginner morning");




        student1 = intelligentStudent.copy();
        student1.setName("Kunal");
        student2 = studentRegistry.getStudent("Ruchit").copy();

        System.out.println("name: " + intelligentStudent.getName()
                        + " gender: " + intelligentStudent.getGender()
                        + " batch: " + intelligentStudent.getBatchName()
//                + " iq:" + intelligentStudent.getIq()
        );


        System.out.println("name: " + student1.getName()
                + " gender: " + student1.getGender()
                + " batch: " + student1.getBatchName());

        System.out.println("name: " + student.getName()
                + " gender: " + student.getGender()
                + " batch: " + student.getBatchName());

        System.out.println("name: " + student2.getName()
                + " gender: " + student2.getGender()
                + " batch: " + student2.getBatchName());
    }
}
