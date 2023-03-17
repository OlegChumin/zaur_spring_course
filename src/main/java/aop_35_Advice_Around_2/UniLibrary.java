package aop_35_Advice_Around_2;

import aop_31_joint_point.Book;
import org.springframework.stereotype.Component;

@Component // бин создается при сканировании пакета если singleton
public class UniLibrary {
    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary");
        System.out.println("----------------------------");
    }

    public String returnBook() {
        int a = 10 / 0;
        System.out.println("Мы возвращаем книгу в UniLibrary");
        System.out.println("----------------------------");
        return "Война и мир";
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из UniLibrary");
        System.out.println("----------------------------");
    }

    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал в UniLibrary");
        System.out.println("----------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("Мы добавляем книгу в UniLibrary");
        System.out.println("----------------------------");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в UniLibrary");
        System.out.println("----------------------------");
    }
}
