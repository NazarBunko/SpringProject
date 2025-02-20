package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = (UniLibrary) context.getBean("uniLibrary");
        //Book book = (Book) context.getBean("book");
        uniLibrary.getBook();
        uniLibrary.returnMagazine();
        uniLibrary.addBook();

        context.close();
    }
}
