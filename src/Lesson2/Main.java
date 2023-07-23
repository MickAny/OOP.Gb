package Lesson2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Doctor doc = new Doctor("Nikolai");
        VetClinic clinic = new VetClinic();



        Dog dog1 = new Dog("Cooper", "Troy");
        Dog dog2 = new Dog("Finn", "Max");
        Dog dog3 = new Dog("Charlie", "Masha");
        Dog dog4 = new Dog("Ollie", "Daniel");

        Bird bird1 = new Bird("Dominique", "Pier");
        Bird bird2 = new Bird("Iron", "Mary");
        Bird bird3 = new Bird("Henry", "Christopher");

        Squirrel squirrel1 = new Squirrel("Larson", "Maven");
        Squirrel squirrel2 = new Squirrel("Otto", "Neal");


        clinic.addNewAnimal(dog1).addNewAnimal(dog2).addNewAnimal(dog3).addNewAnimal(dog4);
        clinic.addNewAnimal(bird1).addNewAnimal(bird2).addNewAnimal(bird3);
        clinic.addNewAnimal(squirrel1).addNewAnimal(squirrel2);
        System.out.println(clinic);


        /*doc.doExplore(dog1, "Broken leg", false);
        doc.doExplore(bird2, "Broken wing", true);
        doc.doExplore(bird3, "Eye infection", true);
        doc.doExplore(squirrel2, "Tail injury", false);
        doc.doExplore(dog3, "Tooth acke", true);
        doc.doExplore(dog4, "Stomach troubles", false);

        findFliers(clinic);
        findRunners(clinic);
        findSwimmers(clinic);*/


    }
    public static void findFliers(VetClinic clinic){
        System.out.println("Fliers: ");
        for (Animal animal: clinic.getAnimals()) {
            if(animal instanceof Flyable){
                System.out.println(animal);
            }
        }
        System.out.println("-".repeat(30));
    }
    public static void findRunners(VetClinic clinic){
        System.out.println("Runnable: ");
        for (Animal animal: clinic.getAnimals()) {
            if(animal instanceof Runnable){
                System.out.println(animal);
            }
        }
        System.out.println("-".repeat(30));
    }
    public static void findSwimmers(VetClinic clinic){
        System.out.println("Swimmers: ");
        for (Animal animal: clinic.getAnimals()) {
            if(animal instanceof Swimmable){
                System.out.println(animal);
            }
        }
        System.out.println("-".repeat(30));
    }

}

