package Lessons.Hibernate.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Runner {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")//path to our configuration
                .addAnnotatedClass(Employee.class)// adding our annotated Entity-class
                .buildSessionFactory();// building session factory


        Employee employee = new Employee("Ivan", "Shestakov", "student", 1000);

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit(); // transaction closing
        } finally {
            factory.close();
        }
    }

}
