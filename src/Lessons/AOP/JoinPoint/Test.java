package Lessons.AOP.JoinPoint;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Test {

    public String testMethod(String str, int num, List<Integer> list) {
        System.out.println("test method executing");
        return "";
    }

}
