package Lessons.Hibernate.DeleteUpdateOperations;

import Lessons.Hibernate.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Runner {

    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .addAnnotatedClass(Employee.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory())
        {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 4);
            employee.setSalary(1600);
            session.createQuery("update Employee set salary = 1000 where surname = 'Tripuzov'").executeUpdate();

            session.getTransaction().commit();

            session = factory.getCurrentSession();

            session.beginTransaction();

            session.delete(session.get(Employee.class, 1));
            session.createQuery("delete Employee where name = 'Ivam'").executeUpdate();

            session.getTransaction().commit();
        }
    }
}
