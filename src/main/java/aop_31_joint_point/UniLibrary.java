package aop_31_joint_point;

import org.springframework.stereotype.Component;

@Component // бин создается при сканировании пакета если singleton
public class UniLibrary {
    public void getBook(Book book) {
        System.out.println("Мы берем книгу из UniLibrary" + book.getName());
        System.out.println("----------------------------");
    }

    public void returnBook() {
        System.out.println("Мы возвращаем книгу в UniLibrary");
        System.out.println("----------------------------");
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
