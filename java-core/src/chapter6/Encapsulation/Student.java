package chapter6.Encapsulation;

public class Student {
    private String name; //default


    private String grade;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }


    //getter
    public String getGrade() {
        return grade;
    }

    //setter
    public void setGrade(String grade) {
        this.grade = grade;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    //getter => default
    public String getName() {
        return this.name;
    }
}
