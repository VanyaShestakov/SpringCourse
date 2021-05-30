package Lessons.AOP.Pointcuts2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecondAspect {

    @Before("Lessons.AOP.Pointcuts2.Pointcuts.forAllGetMethods()")
    private void secondAspectAdvice() {
        System.out.println("secondAspectAdvice executing...");
    }

}
