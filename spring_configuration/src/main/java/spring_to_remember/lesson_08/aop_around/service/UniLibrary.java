package spring_to_remember.lesson_08.aop_around.service;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary {

    public String returnBook() {
        int a = 10/0; // генерим исключение
        System.out.println(" Возвращаем книгу в библиотеку: ");
        return "Война и мир";
    }
}
