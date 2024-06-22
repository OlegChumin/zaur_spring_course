package aop_029_combine_pointcut;

import aop_029_combine_pointcut.config.MyConfig;
import aop_029_combine_pointcut.services.UniLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test029 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        uniLibrary.getBook();
        uniLibrary.returnMagazine();
        uniLibrary.addBook();
        context.close();
    }
}
