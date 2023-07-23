package Lesson2;

public class Dog extends Animal implements Runnable, Swimmable {

    public Dog(String name, String owner) {
        super(name, owner);
    }

    @Override
    public void swim(int speed) {
        System.out.println(getClass().getSimpleName() + "(" + getName() + ") - is swimming at a speed of " + speed + " km/h");
    }


    @Override
    public void run(int speed) {
        System.out.println(getClass().getSimpleName() + "(" + getName() + ") - is running at a speed of " + speed + " km/h");
    }
}
