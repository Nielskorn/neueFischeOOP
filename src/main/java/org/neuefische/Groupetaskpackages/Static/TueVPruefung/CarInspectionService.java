package org.neuefische.Groupetaskpackages.Static.TueVPruefung;

public class CarInspectionService {
    public static Boolean hasFourWheels(Car car) {
       return car.getNumbersofTires() == 4;
    }

    public static Boolean hasSeatBealt( Car car) {
        return car.isSeatBelt();
    }

    public static Boolean hasAirbags(Car car) {
        return car.isAirbag();
    }

    public static Boolean CheckDoors(Car car) {
         if( car.getNumbersofDoors()==3){
             return true;
         } else return car.getNumbersofDoors() == 5;

    }

    public static Boolean CheckCar(Car car) {
        return hasAirbags(car)&&CheckDoors(car)&&hasSeatBealt(car)&&hasFourWheels(car);
    }
}
