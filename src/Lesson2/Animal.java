package Lesson2;

public class Animal {
    private String name;
    private String owner;

    public Animal(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                "owner='" + owner + '\'' +
                '}' + "\n";
    }
}
