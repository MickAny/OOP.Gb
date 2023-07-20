package Lesson1;

public class Dog extends Animal implements Movable, Swimmable{
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move() {
        System.out.println(type + " is moving");
    }

    @Override
    public void swim() {
        System.out.println(type + " is swimming");
    }
}
