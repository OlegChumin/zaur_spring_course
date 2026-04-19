package spring_to_remember.lesson_08.aop_after_throwing.service;

import org.springframework.stereotype.Component;
import spring_to_remember.lesson_08.aop_after_throwing.models.Student;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {

    private List<Student> studentList = new ArrayList<Student>();

    public void addStudents() {
        Student student1 = new Student("Anton", "Bannov", 4, 7.5);
        Student student2 = new Student("Irina", "Ivanova", 2, 8.3);
        Student student3 = new Student("Elena", "Sidorova", 1, 9.1);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
    }

    public List<Student> getStudents() {
        System.out.println("Информация из метода getStudents()");
        studentList.get(3); // генерим исключение
        System.out.println(studentList);
        return studentList;
    }
}
