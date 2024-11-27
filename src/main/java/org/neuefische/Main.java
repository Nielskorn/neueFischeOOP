package org.neuefische;

import org.neuefische.Groupetaskpackages.Roller;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        Book book =new Book("book","jim",150);
        book.printBook();
        book.getPages();
        Person person=new Person("jim",15);
        System.out.println(person.greeting());
        Car car=new Car("vw","passart",2000,"red",150);
        Car car1=new Car("vw","passart",2000,"yellow",150);
        car1.accelerates(50);
        car.strats();
        System.out.println(car.equals(car1) );;
        System.out.println(car.equals(new Car("vw","passart",2000,"red",150)));
        Roller roller=new Roller("roller");

        System.out.println(roller.toString());
    }
}