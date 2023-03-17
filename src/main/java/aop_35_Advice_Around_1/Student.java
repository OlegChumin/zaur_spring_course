package aop_35_Advice_Around_1;

public class Student {
    private String name;
    private String SurName;
    private int course;
    private double avgGrade;

    public Student(String name, String surName, int course, double avgGrade) {
        this.name = name;
        SurName = surName;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String surName) {
        SurName = surName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", SurName='" + SurName + '\'' +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
