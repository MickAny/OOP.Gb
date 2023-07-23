package Lesson2;

public class Squirrel extends Animal implements Flyable, Runnable, Swimmable {
    public Squirrel(String name, String owner) {
        super(name, owner);
    }

    @Override
    public void fly(int speed) {
        System.out.println(getClass().getSimpleName() + "(" + getName() + ") - is flying at a speed of " + speed + " km/h");
    }

    @Override
    public void run(int speed) {
        System.out.println(getClass().getSimpleName() + "(" + getName() + ") - is running at a speed of " + speed + " km/h");
    }

    @Override
    public void swim(int speed) {
        System.out.println(getClass().getSimpleName() + "(" + getName() + ") - is swimming at a speed of " + speed + " km/h");
    }
}
