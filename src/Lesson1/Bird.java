package Lesson1;

public class Bird extends Animal implements Flyable, Movable{
    public Bird(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void fly() {
        System.out.println(type + " is flying");
    }

    @Override
    public void move() {
        System.out.println(type + " is moving");
    }
}
