package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We take the book from UniLibrary");
    }

    public void returnBook() {
        System.out.println("We return the book to UniLibrary");
    }

    public void getMagazine() {
        System.out.println("We take the magazine from UniLibrary");
    }

    public void returnMagazine() {
        System.out.println("We return the magazine to UniLibrary");
    }

    public void addBook() {
        System.out.println("We add the book to UniLibrary");
    }

    public void addMagazine() {
        System.out.println("We add the magazine  to UniLibrary");
    }
}
