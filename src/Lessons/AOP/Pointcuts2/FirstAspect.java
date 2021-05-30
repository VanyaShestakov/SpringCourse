package Lessons.AOP.Pointcuts2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class FirstAspect {

    @Before("Lessons.AOP.Pointcuts2.Pointcuts.forAllGetMethods()")
    private void firstAspectAdvice() {
        System.out.println("firstAspectAdvice executing...");
    }

    @Before("Lessons.AOP.Pointcuts2.Pointcuts.forAllGetMethodsExceptMethodsWithVoidReturnType()")
    private void beforeNotVoidAdvice() {
        System.out.println("beforeNotVoidAdvice executing...");
    }

}
