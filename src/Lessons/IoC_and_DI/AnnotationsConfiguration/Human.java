package Lessons.IoC_and_DI.AnnotationsConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class Human {
    @Value("23")
    private int age;

    @Autowired
    private Eyes eyes;

    @Autowired
    @Qualifier("TShirt")
    private Wearable item;

    @Override
    public String toString() {
        return age + " " + eyes.getColor() + " " + item.getFirm();
    }

    @PostConstruct
    private void init() {
        System.out.println("Bean is created");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Bean is destroyed");
    }
}
