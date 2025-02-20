package aop.aspects;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(* aop.UniLibrary.getBook(aop.Book))")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: try to take the book");
    }

    @Before("execution(* aop.UniLibrary.returnBook())")
    public void beforeReturnBookAdvice(){
        System.out.println("beforeReturnBookAdvice: try to return the book");
    }
}
