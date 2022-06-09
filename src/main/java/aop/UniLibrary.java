package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    public void getBook() {
        System.out.println("We are take book with Uni\n");
    }

    public String returnBook() {
        int a = 10/0;
        System.out.println("We are return book\n");
        return "War and Piece";
    }

    public void getMagazine() {
        System.out.println("We are take magazine with Uni\n");
    }

    public void returnMagazine() {
        System.out.println("We are return magazine\n");
    }

    public void addBook(String personName, Book book) {
        System.out.println("We are add book\n");
    }

    public void addMagazine() {
        System.out.println("We are add magazine\n");
    }
}
