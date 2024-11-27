package org.neuefische.Groupetaskpackages.CodingClassAndObject;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle =new Vehicle("C100","Bmw","1995");
        Car car=new Car("passat","vw","1996",4);
        System.out.println(vehicle.vehicleInfo());
        System.out.println(car.vehicleInfo());
        MotorCycle motorCycle =new MotorCycle("Hildebrand und Wolfmüller","Daimler Reitwagen","1895","Cruiser");
        System.out.println(motorCycle.vehicleInfo());


    }
}
