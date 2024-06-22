package aop_02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test02 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        uniLibrary.getBook("SomeBook");
        context.close();
    }
}
