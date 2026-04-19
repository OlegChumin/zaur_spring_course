package spring_to_remember.lesson_08.aop_after_returning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_to_remember.lesson_08.aop_after_returning.config.MyConfig;
import spring_to_remember.lesson_08.aop_after_returning.models.Student;
import spring_to_remember.lesson_08.aop_after_returning.service.University;

import java.util.List;

public class TestAop {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        University university = context.getBean(University.class);
        university.addStudents();
        List<Student> students = university.getStudents();
        System.out.println(students);
        context.close();
    }
}
