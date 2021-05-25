package Lessons.IoC_and_DI.IoC;

public class Student implements Speakable{
    @Override
    public void speak() {
        System.out.println("Hello, I'm student!");
    }
}
