package Lessons.AOP.Pointcuts;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TestAspect {

    @Before("execution( * *())")
    public void beforeAllMethods() {
        System.out.println("before all methods");
    }

    @Before("execution(private * * ())")
    public void beforeAllPrivateMethods() {
        System.out.println("before all private methods");
    }

    @Before("execution(public * * ())")
    public void beforeAllPublicMethods() {
        System.out.println("before all public methods");
    }

    @Before("execution(public void * ())")
    public void publicVoidAdvice() {
        System.out.println("before public void methods");
    }

    @Before("execution(public void firstMethod())")
    public void publicVoidFirstMethodAdvice() {
        System.out.println("before public void firstMethod()");
    }

    @Before("execution(private void * ())")
    public void privateVoidMethodAdvice() {
        System.out.println("before private void methods");
    }

    @Before("execution(private void secondMethod())")
    public void privateVoidSecondMethodAdvice() {
        System.out.println("before private void secondMethod()");
    }



}
