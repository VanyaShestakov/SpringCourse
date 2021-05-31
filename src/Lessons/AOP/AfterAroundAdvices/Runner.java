package Lessons.AOP.AfterAroundAdvices;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        Divider divider = context.getBean(Divider.class);
        divider.divide(10, 2);
    }
}
