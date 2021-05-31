package Lessons.AOP.AfterAroundAdvices;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("Lessons.AOP.AfterAroundAdvices")
@EnableAspectJAutoProxy
public class Config {

}
