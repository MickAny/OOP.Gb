package Lesson1;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Sfinks", "Small", 10);
        cat.move();
        cat.swim();
        System.out.println(cat);
        System.out.println("-".repeat(30));

        Dog dog = new Dog("Labrador", "Big", 40);
        dog.swim();
        dog.move();
        System.out.println(dog);
        System.out.println("-".repeat(30));

        Bird bird = new Bird("Sparrow", "Small", 3);
        bird.move();
        bird.fly();
        System.out.println(bird);
        System.out.println("-".repeat(30));

        Squirrel squirrel = new Squirrel("Fly-squirrel", "Tiny", 2);
        squirrel.swim();
        squirrel.move();
        squirrel.fly();
        System.out.println(squirrel);





    }
}
/*Дз:     Добавить в класс Animal protected методы двигаться(toGo), летать(fly), плавать(swim).
        Создать по два класса наследника Animal, умеющих летать, плавать, бегать.
        Причем, если допустим кошка не умеет летать, то она не должна этого делать.*/
