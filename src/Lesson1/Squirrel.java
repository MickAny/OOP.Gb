package Lesson1;

public class Squirrel extends Animal  implements Movable, Flyable, Swimmable{
    public Squirrel(String type, String size, double weight) {
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

    @Override
    public void swim() {
        System.out.println(type + " is swimming");
    }
}
