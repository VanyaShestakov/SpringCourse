package Lessons.IoC_and_DI.IoC;

public class Teacher implements Speakable{

    @Override
    public void speak() {
        System.out.println("Hello, I'm teacher!");
    }
}
