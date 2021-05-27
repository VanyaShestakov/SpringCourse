package Lessons.IoC_and_DI.AnnotationsConfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config-AnnotationsConfiguration.xml");
        Human human = context.getBean("human", Human.class);
        System.out.println(human);
    }
}
