package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudent() {
        Student st1 = new Student("Nazar Bunko", 3, 4.8);
        Student st2 = new Student("Ivan Ivanov", 2, 3.8);
        Student st3 = new Student("Petro Petrov", 4, 4.4);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("We get the students from University");
        //System.out.println(students.get(3).getNameSurname());
        System.out.println(students);
        return students;
    }
}
