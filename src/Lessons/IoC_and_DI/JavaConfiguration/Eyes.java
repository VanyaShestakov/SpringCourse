package Lessons.IoC_and_DI.JavaConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Eyes {

    @Value("${Eyes.color}")
    private String color;

    public String getColor() {
        return color;
    }
}
