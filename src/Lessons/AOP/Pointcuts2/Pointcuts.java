package Lessons.AOP.Pointcuts2;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {

    @Pointcut("execution(* get*())")
    public void forAllGetMethods(){};

    @Pointcut("execution(void get*())")
    public void forAllGetMethodsWithVoidReturnType(){};

    @Pointcut("forAllGetMethods() && !forAllGetMethodsWithVoidReturnType()")
    public void forAllGetMethodsExceptMethodsWithVoidReturnType(){};

}
