package DesignPatterns.Builder;

public class Student {
    private int age;
    private String name;
    private String email;
    private int psp;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    public static class StudentBuilder {
        private int age;
        private int psp;

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setPsp(int psp) {
            this.psp = psp;
            return this;
        }

        private boolean validate() {
            if(this.age > 25 && this.psp < 90)
                return false;
            return true;
        }

        public Student build() throws Exception {
            if(!validate()) {
                throw new Exception("Error in parameters");
            }
            return new Student(this);
        }

    }
    private Student (StudentBuilder studentBuilder) {
        this.name = "DEFAULT";
        this.email = "default@default.com";
        this.age = studentBuilder.age;
        this.psp = studentBuilder.psp;
    }

    public static StudentBuilder getBuilder() {
        return new StudentBuilder();
    }
}
