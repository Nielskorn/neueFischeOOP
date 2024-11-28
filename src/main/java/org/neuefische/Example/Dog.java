package org.neuefische.Example;

public class Dog extends Pet{
    int dogAge;


    public Dog(String name, int age, int dogAge) {
        super(name, age);
        this.dogAge = dogAge;
    }

    public int getDogAge() {
        return dogAge;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }

    @Override
    public String makeNoise() {
        return "wuff";
    }
}
