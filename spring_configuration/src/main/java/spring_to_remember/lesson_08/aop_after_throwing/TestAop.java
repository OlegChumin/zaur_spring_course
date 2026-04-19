package spring_to_remember.lesson_08.aop_after_throwing;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_to_remember.lesson_08.aop_after_throwing.config.MyConfig;
import spring_to_remember.lesson_08.aop_after_throwing.models.Student;
import spring_to_remember.lesson_08.aop_after_throwing.service.University;

import java.util.List;

public class TestAop {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        University university = context.getBean(University.class);
        university.addStudents();
        try {
            List<Student> students = university.getStudents();
            System.out.println(students);
        } catch (Exception e) {
            System.out.println(" Было поймано исключение " + e);
        }
        context.close();
    }
}
