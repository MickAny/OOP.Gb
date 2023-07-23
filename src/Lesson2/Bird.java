package Lesson2;

public class Bird extends Animal implements Flyable, Swimmable{
    public Bird(String name, String owner) {
        super(name, owner);
    }

    @Override
    public void fly(int speed) {
        System.out.println(getClass().getSimpleName() + "(" + getName() + ") - is flying at a speed of " + speed + " km/h");
    }

    @Override
    public void swim(int speed) {
        System.out.println(getClass().getSimpleName() + "(" + getName() + ") - is swimming at a speed of " + speed + " km/h");
    }
}
