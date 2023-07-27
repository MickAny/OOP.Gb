package Lesson3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy>, Comparator<Pharmacy> {
    private List<Component> components;
    public Pharmacy() {
        this.components = new ArrayList<>();
    }
    public List<Component> getComponents() {
        return components;
    }
    public Pharmacy addComponent(Component component) {
        this.components.add(component);
        return this;
    }
    private int getPharmacyPower() {
        int power = 0;
        for (Component component : components) {
            power += component.getPower();
        }
        return power;
    }

    @Override
    public String toString() {
        return String.format("%s Состав: %s, сила: %s\n", getClass().getSimpleName(), this.components,
                this.getPharmacyPower());
    }



    @Override
    public Iterator<Component> iterator() {
        return new ComponentIterator(this);
    }

    @Override
    public int compareTo(Pharmacy pharmacy) {

        int dif = this.getPharmacyPower() - pharmacy.getPharmacyPower();
        if(dif != 0) return dif;

        dif = this.components.size() - pharmacy.components.size();
        if(dif != 0) return dif;

        for( int i = 0; i<this.components.size(); i++){
            dif = this.components.get(i).getName().compareTo(pharmacy.components.get(i).getName());
            if (dif != 0) return dif;
        }
        return 0;
    }

    @Override
    public int compare(Pharmacy o1, Pharmacy o2) {
        return o1.compareTo(o2);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Pharmacy tempPharmacy = (Pharmacy)obj;
        if(this.components.size() != tempPharmacy.components.size()) return false;

        return compareByNames(tempPharmacy);
    }

    private boolean compareByNames(Pharmacy pharmacy){
        for (Component component : pharmacy.components) {
            if(!findComponent(component)) return false;
        }
        return true;
    }

    private boolean findComponent(Component component){
        for (Component ourComponent : this.components) {
            if(ourComponent.getName() == component.getName()) return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 13131;
        int result = 1;
        StringBuilder stringBuilder = new StringBuilder();
        for (Component component : components) {
            stringBuilder.append(component.getName()).append(component.getWeight());
            result += stringBuilder.toString().hashCode();
            stringBuilder.setLength(0);

            result += prime * component.getPower();
        }
        return result;
    }


}