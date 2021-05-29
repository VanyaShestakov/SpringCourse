package Lessons.AOP.Pointcuts;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Test {
    public void firstMethod() {
        System.out.println("public void firstMethod() executing...");
    }

    private void secondMethod() {
        System.out.println("private void secondMethod() executing...");
    }

    public String thirdMethod() {
        System.out.println("public String thirdMethod() executing...");
        return "A";
    }

    public void fourthMethod(String str) {
        System.out.println("public void fourthMethod(String str) executing...");
    }

    public int fifthMethod(String str) {
        System.out.println("public int fifthMethod(String str) executing...");
        return 0;
    }

}
