package aop_02;

import org.springframework.stereotype.Component;

@Component // бин создается при сканировании пакета если singleton
public class UniLibrary {
    public void getBook(String bookName) {
        System.out.println("Мы берем книгу из UniLibrary " + bookName);
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из UniLibrary");
    }
}
