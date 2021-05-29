package Lessons.IoC_and_DI.JavaConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class TShirt implements Wearable {

    @Value("${TShirt.firm}")
    private String firm;

    public String getFirm() {
        return firm;
    }
}
