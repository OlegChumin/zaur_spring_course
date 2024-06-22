package aop_03;

import aop_03.config.MyConfig;
import aop_03.models.Book;
import aop_03.services.UniLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test03 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);
        uniLibrary.getBook(book);
        uniLibrary.getMagazine(22);
        context.close();
    }
}
