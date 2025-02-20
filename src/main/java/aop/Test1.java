package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = (UniLibrary) context.getBean("uniLibrary");
        Book book = (Book) context.getBean("book");
        uniLibrary.getBook(book);
        uniLibrary.returnBook();

        SchoolLibrary schoolLibrary = (SchoolLibrary) context.getBean("schoolLibrary");
        schoolLibrary.getBook();

        context.close();
    }
}
