package spring_to_remember.lesson_07.aop_order;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_to_remember.lesson_07.aop_order.config.MyConfig;
import spring_to_remember.lesson_07.aop_order.service.Library;
import spring_to_remember.lesson_07.aop_order.service.SchoolLibrary;

public class TestAopOrder {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Library library = context.getBean(Library.class);
        library.getBook();
        library.getMagazine();

        SchoolLibrary schoolLibrary = context.getBean(SchoolLibrary.class);
        schoolLibrary.getBook();

        context.close();
    }
}
