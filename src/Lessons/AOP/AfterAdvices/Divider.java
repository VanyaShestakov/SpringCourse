package Lessons.AOP.AfterAdvices;

import org.springframework.stereotype.Component;

@Component
public class Divider {

    public int divide(int dividend, int divider) {
        System.out.println("DIVIDE METHOD EXECUTING...");
        return dividend / divider;
    }

}
