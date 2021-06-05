package Lessons.Hibernate.OneToOneRelations;
import Lessons.Hibernate.OneToOneRelations.Tables.Details;
import Lessons.Hibernate.OneToOneRelations.Tables.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Runner {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")//path to our configuration
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)// adding our annotated Entity-class
                .buildSessionFactory();
             Session session = factory.getCurrentSession())
        {
            Employee employee = new Employee("Sacha", "Ivanov", "QA", 2500);
            Details details = new Details("Minsk", "+37523583578", "sanya@gmail.com");
            employee.setDetails(details);
            details.setEmployee(employee);
            session.beginTransaction();
            session.save(details);
            session.getTransaction().commit();
        }
    }
}
