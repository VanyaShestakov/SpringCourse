package Lessons.IoC_and_DI.DI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config-DI.xml");
        Animal animal = context.getBean("cat", Animal.class);
        animal.say();
        Animal dog = context.getBean("dog", Animal.class);
        dog.say();

        context.close();
    }
}
