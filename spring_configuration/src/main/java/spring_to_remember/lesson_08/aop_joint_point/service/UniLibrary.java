package spring_to_remember.lesson_08.aop_joint_point.service;

import org.springframework.stereotype.Component;
import spring_to_remember.lesson_08.aop_joint_point.models.Book;

@Component
public class UniLibrary {

    public void getBook(Book book) {
        System.out.println(" Берем книгу из библиотеки: " + book.getName());
        System.out.println("---------------------------------------");
    }

    public void returnBook() {
        System.out.println(" Возвращаем книгу в библиотеку: ");
        System.out.println("---------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Возвращаем журнал в библиотеку: ");
        System.out.println("---------------------------------------");
    }

    public void getMagazine(Book book) {
        System.out.println("Берем журнал из библиотеки: ");
        System.out.println("---------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println(personName + " добавляет книгу в библиотеку: " + book.getName());
        System.out.println("---------------------------------------");
    }

    public void addMagazine() {
        System.out.println("Добавляем журнал в библиотеку: ");
        System.out.println("--------------------------------");
    }

}
