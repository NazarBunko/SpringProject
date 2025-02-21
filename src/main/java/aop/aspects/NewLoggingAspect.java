package aop.aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around( "execution(public String returnBook())")
    public Object beforeAddLoggingAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("aroundGetLoggingAdvice: try to return book to library");
        Object object = null;
        try{
            object = joinPoint.proceed();
        } catch (Exception e) {
            System.out.println("aroundGetLoggingAdvice: " + e);
            throw e;
        }


        System.out.println("aroundGetLoggingAdvice: return book to library");

        return object;
    }
}
