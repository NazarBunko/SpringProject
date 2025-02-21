package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    /*@Before("execution(* getStudents())")
    public void beforeGetStudentsAdvice(){
        System.out.println("beforeGetStudentsAdvice: logging list of students before getStudents() method");
        System.out.println("--------------------------------------------");
    }*/

    /*@AfterReturning(pointcut =  "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsAdvice(List<Student> students){

        Student firstStudent = students.get(0);
        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "Mr. " + nameSurname;
        firstStudent.setNameSurname(nameSurname);

        double avgGrade = firstStudent.getAvgGrade();
        avgGrade = avgGrade - 1;
        firstStudent.setAvgGrade(avgGrade);

        System.out.println("beforeGetStudentsAdvice: logging list of students after getStudents() method");
        System.out.println("--------------------------------------------");
    }*/

    /*@AfterThrowing(pointcut =  "execution(* getStudents())" , throwing = "ex")
    public void afterThrowingGetStudentsAdvice(Throwable ex){
        System.out.println("afterThrowingGetStudentsAdvice: logging list of students after getStudents() method: " + ex.getMessage());
        System.out.println("--------------------------------------------");
    }*/

    @After("execution(* getStudents())")
    public void afterGetStudentsAdvice(){
        System.out.println("afterGetStudentsAdvice: logging list of students after getStudents() method");
        System.out.println("--------------------------------------------");
    }
}
