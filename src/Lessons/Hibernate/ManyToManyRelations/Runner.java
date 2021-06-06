package Lessons.Hibernate.ManyToManyRelations;

import Lessons.Hibernate.ManyToManyRelations.Tables.Course;
import Lessons.Hibernate.ManyToManyRelations.Tables.Student;
import Lessons.Hibernate.OneToManyRelations.Tables.School;
import Lessons.Hibernate.OneToManyRelations.Tables.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Runner {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Course.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
             Session session = factory.getCurrentSession())
        {
            session.beginTransaction();
            Course course = session.get(Course.class, 4);
            session.delete(course);
            session.getTransaction().commit();
        }
    }
}
