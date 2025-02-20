package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook(Book book) {
        System.out.println("We take the " + book.getName() + " from UniLibrary");
    }

    public void returnBook() {
        System.out.println("We return the book to UniLibrary");
    }
}
