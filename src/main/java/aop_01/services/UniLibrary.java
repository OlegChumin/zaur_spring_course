package aop_01.services;

import org.springframework.stereotype.Component;

@Component // бин создается при сканировании пакета если singleton
public class UniLibrary extends AbstractLibrary {

    public void getMagazine() {
        System.out.println("Мы берем журнал из UniLibrary");
    }

    @Override
    public void getBook() {
        {
            System.out.println("Мы берем книгу из UniLibrary");
        }
    }

    public void returnBook() {
        System.out.println(" Возвращаем книгу ");
    }
}
