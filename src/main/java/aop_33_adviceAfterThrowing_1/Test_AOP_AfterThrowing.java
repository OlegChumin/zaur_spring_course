package aop_33_adviceAfterThrowing_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test_AOP_AfterThrowing {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        University university = context.getBean("university", University.class);
        university.addStudents();
        try {
            List<Student> students = university.getStudents();
            System.out.println(students);
        } catch (Exception e) {
            System.out.println("Было поймано исключение " + e);
        }
        context.close();
    }
}