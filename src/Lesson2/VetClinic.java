package Lesson2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class VetClinic {

    private final List<Animal> animals;

    public VetClinic() {
        this.animals = new ArrayList<>();
    }

    public VetClinic addNewAnimal(Animal animal){
        animals.add(animal);
        return this;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    @Override
    public String toString() {
        return "VetClinic{" +
                "animals=" + animals +
                '}';
    }
}
