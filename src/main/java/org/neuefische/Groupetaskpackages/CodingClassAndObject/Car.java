package org.neuefische.Groupetaskpackages.CodingClassAndObject;

public class Car extends Vehicle {
   private int numberOfDoors;

    public Car(String model, String manufacturer, String yearOfManufacture,int numberOfDoors) {
        super(model, manufacturer, yearOfManufacture);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    String vehicleInfo() {
        return super.vehicleInfo()+"\n"+"numberOfDoors: "+numberOfDoors;
    }
}
