package org.neuefische.Groupetaskpackages.Static;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();
        Animal animal4 = new Animal();
        System.out.println( animal.incrementInstanceCount());
        System.out.println(Animal.incrementTotalCount());
        System.out.println(animal.toString());

    }
}
