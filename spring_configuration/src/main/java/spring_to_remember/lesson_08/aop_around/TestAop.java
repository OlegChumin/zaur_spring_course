package spring_to_remember.lesson_08.aop_around;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_to_remember.lesson_08.aop_around.config.MyConfig;
import spring_to_remember.lesson_08.aop_around.service.UniLibrary;

public class TestAop {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean(UniLibrary.class);
        String bookName = uniLibrary.returnBook();
        System.out.println("В библиотеку вернули книгу " + bookName);
        context.close();
        System.out.println("Main thread ends..");
    }
}
