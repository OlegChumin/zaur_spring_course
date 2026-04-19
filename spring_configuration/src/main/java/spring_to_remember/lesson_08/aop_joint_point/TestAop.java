package spring_to_remember.lesson_08.aop_joint_point;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_to_remember.lesson_08.aop_joint_point.config.MyConfig;
import spring_to_remember.lesson_08.aop_joint_point.models.Book;
import spring_to_remember.lesson_08.aop_joint_point.service.UniLibrary;

public class TestAop {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Book book = context.getBean("book", Book.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        uniLibrary.addBook("Anton", book);
        uniLibrary.addMagazine();

        context.close();
    }
}
