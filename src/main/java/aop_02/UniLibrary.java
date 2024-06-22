package aop_02;

import aop_03.models.Book;
import org.springframework.stereotype.Component;

@Component // бин создается при сканировании пакета если singleton
public class UniLibrary {
    public void getBook(String book) {
        System.out.println("Мы берем книгу из UniLibrary " + book);
    }

    public void getMagazine(int a) {
        System.out.println("Мы берем журнал из UniLibrary");
    }
}
