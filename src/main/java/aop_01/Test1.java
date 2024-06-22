package aop_01;

import aop_01.config.MyConfig;
import aop_01.services.SchoolLibrary;
import aop_01.services.UniLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        uniLibrary.getBook();
        System.out.println("------------------------");
        uniLibrary.getMagazine();
        System.out.println("------------------------");
        uniLibrary.returnBook();
        System.out.println("------------------------");

        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        schoolLibrary.getBook();
        context.close();
    }
}
