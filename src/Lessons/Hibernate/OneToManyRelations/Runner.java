package Lessons.Hibernate.OneToManyRelations;

import Lessons.Hibernate.OneToManyRelations.Tables.School;
import Lessons.Hibernate.OneToManyRelations.Tables.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Runner {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .addAnnotatedClass(Teacher.class)
                .addAnnotatedClass(School.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
             Session session = factory.getCurrentSession())
        {
              //School school = new School(15, "qwe15@mail.com");
           // Teacher firstTeacher = new Teacher("Gleb", "Ivanov");
//            Teacher secondTeacher = new Teacher("Stepan", "Stepanenko");
//            school.add(firstTeacher);
//            school.add(secondTeacher);

            session.beginTransaction();
            School school = session.get(School.class, 2);
            Teacher teacher = session.get(Teacher.class, 3);
            teacher.setSchool(null);
            session.delete(school);
            session.getTransaction().commit();
        }
    }
}
