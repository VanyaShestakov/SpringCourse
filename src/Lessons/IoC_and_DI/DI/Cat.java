package Lessons.IoC_and_DI.DI;
//DI constructor example
public class Cat extends Animal {
    private Eyes eyes;
    private String color;
    private int age;

    public Cat(Eyes eyes, String color, int age) {
        this.eyes = eyes;
        this.color = color;
        this.age = age;
    }


    @Override
    public void say() {
        System.out.println("Hello, I'm cat with " + eyes.getColor() + " color of eyes. My age: " + age +
                ", My color: " + color);

    }
}
