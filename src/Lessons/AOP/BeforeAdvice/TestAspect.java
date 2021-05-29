package Lessons.AOP.BeforeAdvice;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

@Component
@Aspect
public class TestAspect {

    @Before("execution(public void Lessons.AOP.BeforeAdvice.Test.someMethod())")
    public void beforeSomeMethodAdvice() {
        System.out.println("Before advice execution");
    }
}
