package org.neuefische.Groupetaskpackages.CodingClassAndObject;

public class Vehicle {
   private String manufacturer;
    private String model;
    private String yearOfManufacture;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public Vehicle(String model, String manufacturer, String yearOfManufacture) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
    }




    String vehicleInfo(){
        return "Manufacturer: " + manufacturer + "\nModel: " + model+ "\nYear Of Manufacture: " + yearOfManufacture;
    }
}
