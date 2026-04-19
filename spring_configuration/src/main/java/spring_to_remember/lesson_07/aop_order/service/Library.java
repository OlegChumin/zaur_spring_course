package spring_to_remember.lesson_07.aop_order.service;

import org.springframework.stereotype.Component;
import spring_to_remember.lesson_07.aop_order.models.Book;

@Component
public class Library {
    public void getBook() {
        System.out.println("Берем книгу из Library");
    }

    public void getMagazine() {
        System.out.println("Получаем журнал");
    }
}
