package Lessons.IoC_and_DI.JavaConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        Human human = context.getBean("human", Human.class);
        System.out.println(human);
        context.close();
    }
}
