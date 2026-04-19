package spring_to_remember.lesson_07.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_to_remember.lesson_07.aop.config.MyConfig;
import spring_to_remember.lesson_07.aop.models.Book;
import spring_to_remember.lesson_07.aop.service.Library;
import spring_to_remember.lesson_07.aop.service.SchoolLibrary;

public class TestAop {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Book book = new Book();

        Library library = context.getBean(Library.class);
        library.getBook(book);
        library.returnMagazine();

        SchoolLibrary schoolLibrary = context.getBean(SchoolLibrary.class);
        schoolLibrary.getBook();

        context.close();
    }
}
