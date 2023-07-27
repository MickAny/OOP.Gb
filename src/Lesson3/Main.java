package Lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy1 = new Pharmacy();
        pharmacy1.addComponent(new Component("Peneciline", "1", 10))
                .addComponent(new Component("Ibuklin", "5", 6));

        Pharmacy pharmacy2 = new Pharmacy();
        pharmacy2.addComponent(new Component("Kartizol", "11", 30))
                .addComponent(new Component("Magmanat", "1.2", 2));

        Pharmacy pharmacy3 = new Pharmacy();
        pharmacy3.addComponent(new Component("Aminoreks", "1.5", 20))
                .addComponent(new Component("Anagrelid", "1.3", 7));

        Pharmacy pharmacy4 = new Pharmacy();
        pharmacy4.addComponent(new Component("Peneciline", "1", 10))
                .addComponent(new Component("Ibuklin", "5", 6));

        Pharmacy pharmacy5 = new Pharmacy();
        pharmacy5.addComponent(new Component("Altacide", "2", 13))
                .addComponent(new Component("Alerza", "2.5", 11));



        Set<Pharmacy> result = new HashSet<>();
        result.add(pharmacy1);
        result.add(pharmacy2);
        result.add(pharmacy3);
        result.add(pharmacy4);
        result.add(pharmacy5);

        System.out.println(result.size());

    }
}