package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.reflect.MethodSignature;

import static org.springframework.cglib.core.ReflectUtils.getSignature;

@Component
@Aspect
@Order(1)
public class LoggingAspect {


    /*@Pointcut("execution(* aop.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary(){}

    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
    private void returnMagazineMethod(){}

    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineMethod()")
    private void allMethodsFromUniLibraryButReturnMagazine(){}

    @Before("allMethodsFromUniLibraryButReturnMagazine()")
    public void beforeLoggingAdvice(){
        System.out.println("beforeLoggingAdvice: writing Log #1");
    }*/

    /*@Pointcut("execution(* aop.UniLibrary.get*())")
    private void allGetMethodsFromUniLibrary(){}

    @Pointcut("execution(* aop.UniLibrary.return*())")
    private void allReturnMethodsFromUniLibrary(){}

    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
    private void allGetAndReturnMethodsFromUniLibrary(){}

    @Before("allGetMethodsFromUniLibrary()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: writing Log #1");
    }

    @Before("allReturnMethodsFromUniLibrary()")
    public void beforeReturnLoggingAdvice(){
        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
    }

    @Before("allGetAndReturnMethodsFromUniLibrary()")
    public void beforeGetAndReturnLoggingAdvice(){
        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
    }*/

    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){

        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        System.out.println("methodSignature: " + methodSignature);
        System.out.println("methodSignature.getMethod(): " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType(): " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName(): " + methodSignature.getName());

        if(methodSignature.getName().equals("addBook")){
            Object[] args = joinPoint.getArgs();
            for(Object arg : args){
                if(arg instanceof Book myBook){
                    System.out.println("myBook: " + myBook.getName() + ", " + myBook.getAuthor() + ", " + myBook.getYearOfPublication());
                }
                else if(arg instanceof String){
                    System.out.println("Book was added by " + arg);
                }
            }
        }

        System.out.println("beforeGetLoggingAdvice: logging to try to take the book/magazine");
        System.out.println("--------------------------------------------");
    }
}
