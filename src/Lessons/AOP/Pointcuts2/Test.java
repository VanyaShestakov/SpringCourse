package Lessons.AOP.Pointcuts2;

import org.springframework.stereotype.Component;

@Component
public class Test {
    public int getMethod() {
        System.out.println("getMethod executing...");
        return 1;
    }

    public void getVoid() {
        System.out.println("getVoid executing...");
    }
}
