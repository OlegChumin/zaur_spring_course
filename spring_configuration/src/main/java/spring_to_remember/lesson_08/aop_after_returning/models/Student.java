package spring_to_remember.lesson_08.aop_after_returning.models;

public class Student {
    private String name;
    private String surName;
    private int course;
    private double avrGrage;

    public Student(String name, String surName, int course, double avrGrage) {
        this.name = name;
        this.surName = surName;
        this.course = course;
        this.avrGrage = avrGrage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvrGrage() {
        return avrGrage;
    }

    public void setAvrGrage(double avrGrage) {
        this.avrGrage = avrGrage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", course=" + course +
                ", avrGrage=" + avrGrage +
                '}';
    }
}
