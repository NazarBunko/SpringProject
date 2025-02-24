package hibernate_test_one_to_many_uni;

import hibernate_test_one_to_many_uni.entity.Department;
import hibernate_test_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;

        try{
            Employee emp1 = new Employee("Nazar", "Bunko", 500);
            Employee emp2 = new Employee("Ivan", "Lox", 600);
            Department dep = new Department("IT", 600, 500);
            dep.addEmployeeToDepartment(emp1);
            dep.addEmployeeToDepartment(emp2);

            session = factory.getCurrentSession();
            session.beginTransaction();

            session.save(dep);

            session.getTransaction().commit();

            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
