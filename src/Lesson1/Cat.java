package Lesson1;

public class Cat extends Animal implements Movable, Swimmable{
    public Cat(String type, String size, double weight) {
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
