package Lessons.IoC_and_DI.JavaConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Human {
    private int age;
    private Eyes eyes;
    private Wearable item;

    public Human(int age, Eyes eyes, Wearable item) {
        this.age = age;
        this.eyes = eyes;
        this.item = item;
    }

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
