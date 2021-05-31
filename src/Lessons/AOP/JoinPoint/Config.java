package Lessons.AOP.JoinPoint;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("Lessons.AOP.JoinPoint")
@EnableAspectJAutoProxy
public class Config {

}
