package Lessons.Hibernate.SaveGetOperations;

import Lessons.Hibernate.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        SessionFactory factory =new Configuration()
                .addAnnotatedClass(Employee.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        Employee employee = new Employee("Stepan", "Ivanov", "Developer", 3000);

        session.beginTransaction();

        session.save(employee);
        Employee returnedEmployee = session.get(Employee.class, 1);
        List<Employee> employees = session.createQuery("from Employee" +
                " where name = 'ALeksandr' and salary > 500").getResultList();

        session.getTransaction().commit();
        factory.close();

        System.out.println(returnedEmployee);
        for (Employee emp: employees) {
            System.out.println(emp);
        }

    }

}
