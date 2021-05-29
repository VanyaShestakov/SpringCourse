package Lessons.IoC_and_DI.JavaConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Glasses implements  Wearable {
    private String firm;

    @Override
    public String getFirm() {
        return firm;
    }
}
