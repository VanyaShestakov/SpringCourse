package Lessons.AOP.Pointcuts2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        Test test = context.getBean(Test.class);
        test.getMethod();
        test.getVoid();
    }
}
