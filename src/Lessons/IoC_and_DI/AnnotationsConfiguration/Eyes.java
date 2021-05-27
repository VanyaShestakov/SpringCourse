package Lessons.IoC_and_DI.AnnotationsConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Eyes {

    @Value("green")
    private String color;

    public String getColor() {
        return color;
    }
}
