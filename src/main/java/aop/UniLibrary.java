package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We take the book from UniLibrary");
        System.out.println("--------------------------------------------");
    }

    public void returnBook() {
        System.out.println("We return the book to UniLibrary");
        System.out.println("--------------------------------------------");
    }

    public void getMagazine() {
        System.out.println("We take the magazine from UniLibrary");
        System.out.println("--------------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("We return the magazine to UniLibrary");
        System.out.println("--------------------------------------------");
    }

    public void addBook(String authorName, Book book) {
        System.out.println("We add the book to UniLibrary");
        System.out.println("--------------------------------------------");
    }

    public void addMagazine() {
        System.out.println("We add the magazine to UniLibrary");
        System.out.println("--------------------------------------------");
    }
}
