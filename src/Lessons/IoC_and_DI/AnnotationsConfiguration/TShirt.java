package Lessons.IoC_and_DI.AnnotationsConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TShirt implements Wearable {

    @Value("${TShirt.firm}")
    private String firm;

    @Override
    public String getFirm() {
        return firm;
    }
}
