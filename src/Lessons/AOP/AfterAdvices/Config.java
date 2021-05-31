package Lessons.AOP.AfterAdvices;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("Lessons.AOP.AfterAdvices")
@EnableAspectJAutoProxy
public class Config {

}
