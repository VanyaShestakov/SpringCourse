package Lessons.AOP.JoinPoint;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;

@Component
@Aspect
public class TestAspect {

    @Before("execution(public String Lessons.AOP.JoinPoint.Test.testMethod(String, int, java.util.List<Integer>))")
    public void testAdvice(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Class[] classes = signature.getParameterTypes();
        System.out.println("method signature: " + signature.getMethod());
        System.out.println("method name: " + signature.getName());
        System.out.println("return type: " + signature.getReturnType());
        System.out.println("modifier: " + Modifier.toString(signature.getModifiers()));

        for (Class el: classes) {
            System.out.println(el.getName());
        }
        
        System.out.println("test advice executing ...");
    }
}
