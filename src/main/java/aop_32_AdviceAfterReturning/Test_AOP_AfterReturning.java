package aop_32_AdviceAfterReturning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_AOP_AfterReturning {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        University university = context.getBean("university", University.class);
        university.addStudents();
        System.out.println(university.getStudents());
        context.close();
    }
}
