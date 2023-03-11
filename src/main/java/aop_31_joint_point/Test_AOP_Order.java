package aop_31_joint_point;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_AOP_Order {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        uniLibrary.getBook();
        uniLibrary.getMagazine();
        context.close();
    }
}
