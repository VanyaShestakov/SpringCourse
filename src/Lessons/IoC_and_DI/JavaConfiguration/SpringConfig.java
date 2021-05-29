package Lessons.IoC_and_DI.JavaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("classpath:AnnotationsConfiguration.properties")
public class SpringConfig {

    @Bean
    public Human human() {
        return new Human(2, eyes(), tShirt());
    }

    @Bean
    public Eyes eyes() {
        return new Eyes();
    }

    @Bean
    public TShirt tShirt() {
        return new TShirt();
    }


}
