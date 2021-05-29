package Lessons.AOP.BeforeAdvice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        Test test = context.getBean("test", Test.class);
        test.someMethod();
        test.destroy();
        context.close();
    }
}
