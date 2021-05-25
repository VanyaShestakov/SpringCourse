package Lessons.IoC_and_DI.DI;

public class Dog extends Animal {
    private Eyes eyes;
    private String color;
    private int age;

    public void setEyes(Eyes eyes) {
        this.eyes = eyes;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void say() {
        System.out.println("Hello, I'm dog with " + eyes.getColor() + " color of eyes. My age: " + age +
                ", My color: " + color);

    }
}
