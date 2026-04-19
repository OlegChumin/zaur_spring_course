package spring_to_remember.lesson_07.aop.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import spring_to_remember.lesson_07.aop.models.Book;

@Component
public class Library {
    public void getBook(Book book) {
        System.out.println("Берем книгу из Library");
    }

    public void returnMagazine() {
        System.out.println("Возвращаем журнал");
    }
}
