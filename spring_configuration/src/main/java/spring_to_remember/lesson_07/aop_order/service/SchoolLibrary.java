package spring_to_remember.lesson_07.aop_order.service;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary {
    public void getBook() {
        System.out.println("Берем книгу из SchoolLibrary");
    }
}
