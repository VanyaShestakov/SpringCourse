package Lessons.IoC_and_DI.BeanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config-BeanScope.xml");
        SingletoneObj singletonObj = context.getBean("singletonObj", SingletoneObj.class);
        SingletoneObj otherSingletonObj = context.getBean("singletonObj", SingletoneObj.class);

        System.out.println(singletonObj.getObjName());
        otherSingletonObj.setObjName("Other name");
        System.out.println(singletonObj.getObjName());

        System.out.println(singletonObj.equals(otherSingletonObj));

        PrototypeObj prototypeObj = context.getBean("prototypeObj", PrototypeObj.class);
        PrototypeObj otherPrototypeObj = context.getBean("prototypeObj", PrototypeObj.class);

        System.out.println(prototypeObj.equals(otherPrototypeObj));

        context.close();

    }
}
