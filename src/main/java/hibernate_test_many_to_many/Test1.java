package hibernate_test_many_to_many;

import hibernate_test_many_to_many.entity.Child;
import hibernate_test_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;
        try{
            session = factory.getCurrentSession();

            /*Section section1 = new Section("Tennis");
            Section section2 = new Section("Volleyball");
            Section section3 = new Section("HobbyHorsing");
            Child child4 = new Child("Child5", 15);
            child4.addSectionToChildren(section1);
            child4.addSectionToChildren(section2);
            child4.addSectionToChildren(section3);*/

            session.beginTransaction();

            session.delete(session.get(Child.class, 7));

            session.getTransaction().commit();
            System.out.println("Done!");
        }
        finally{
            session.close();
            factory.close();
        }
    }
}
