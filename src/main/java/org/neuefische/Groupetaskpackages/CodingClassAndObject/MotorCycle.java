package org.neuefische.Groupetaskpackages.CodingClassAndObject;

public class MotorCycle extends Vehicle {
    String type;

    public MotorCycle(String model, String manufacturer, String yearOfManufacture,String type) {
        super(model, manufacturer, yearOfManufacture);
        this.type=type;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    String vehicleInfo() {
        return super.vehicleInfo()+"\ntype:"+type+"\n";
    }
}
