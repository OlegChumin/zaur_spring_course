package aop_029_combine_pointcut.services;

import org.springframework.stereotype.Component;

@Component // бин создается при сканировании пакета если singleton
public class UniLibrary {
    public void getBook() {
        System.out.println("Берем книгу из UniLibrary");
    }

    public void returnBook() {
        System.out.println("Возвращаем книгу в UniLibrary");
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из UniLibrary");
    }

    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал в UniLibrary");
    }

    public void addBook() {
        System.out.println("Добавляем книгу в UniLibrary");
    }

    public void addMagazine() {
        System.out.println("Добавляем журнал в UniLibrary");
    }
}
