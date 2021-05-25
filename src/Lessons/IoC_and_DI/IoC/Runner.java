package Lessons.IoC_and_DI.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config-IoC.xml");
        Speakable student = context.getBean("student", Speakable.class);
        Speakable teacher = context.getBean("teacher", Speakable.class);
        student.speak();
        teacher.speak();
    }
}
