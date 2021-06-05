package Lessons.Hibernate.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Runner {

    public static void main(String[] args) {

        //path to our configuration
        // adding our annotated Entity-class
        // building session factory


        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")//path to our configuration
                .addAnnotatedClass(Employee.class)// adding our annotated Entity-class
                .buildSessionFactory();
             Session session = factory.getCurrentSession())
        {
            Employee employee = new Employee("Ivam", "Shestakov", "student", 1000);
            //Session session = factory.getCurrentSession();
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit(); // transaction closing
        }


    }

}
