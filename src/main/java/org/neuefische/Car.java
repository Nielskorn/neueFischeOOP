package org.neuefische;

import java.util.Objects;

public class Car {
    String brand;
    String model;
    int year;
    String color;
    int horsepower;
    int speed=0;

    public Car(String brand,String Model,int year,String color,int horsepower){
        this.brand=brand;
        this.model=Model;
        this.year=year;
        this.color=color;
        this.horsepower=horsepower;
    }
    public void strats(){
        System.out.println("Start the Car "+model);
    }
    public void accelerates(int acceleration){
        speed=speed+acceleration;
        System.out.println("The Speed is Now "+speed +"km/h");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && horsepower == car.horsepower && speed == car.speed && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, color, horsepower, speed);
    }
}
