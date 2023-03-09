package aop_30;

import org.springframework.stereotype.Component;

@Component // бин создается при сканировании пакета если singleton
public class UniLibrary {
    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary");
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из UniLibrary");
    }
}
