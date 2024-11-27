package org.neuefische;

public class Person {
private String name;
private String lastName;
private int age;
private String gender;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String name, String lastName, int age, String gender) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
    public String greeting() {
        return "Welcome i am " + name + " and "+ age + "years Old ";
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }




}
