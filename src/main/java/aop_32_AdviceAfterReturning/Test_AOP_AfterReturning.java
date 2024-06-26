package aop_32_AdviceAfterReturning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test_AOP_AfterReturning {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        University university = context.getBean("university", University.class);
        university.addStudents();
        List<Student> students = university.getStudents();
        System.out.println(students);
        //Thread.sleep(1000);
        context.close();
    }
}
