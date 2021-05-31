package Lessons.AOP.JoinPoint;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        Test test = context.getBean(Test.class);

        test.testMethod("34", 3, new ArrayList<>(Arrays.asList(1, 33, 3)));

    }
}
