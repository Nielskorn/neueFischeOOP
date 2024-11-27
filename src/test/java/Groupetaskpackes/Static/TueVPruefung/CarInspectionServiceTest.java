package Groupetaskpackes.Static.TueVPruefung;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.neuefische.Groupetaskpackages.Static.TueVPruefung.Car;
import org.neuefische.Groupetaskpackages.Static.TueVPruefung.CarInspectionService;

public class CarInspectionServiceTest {
    @Test
    public void carHasFourWheelers() {
        Boolean expected = true;
        Car car = new Car(4,4,true,true);
        Assertions.assertEquals(expected, CarInspectionService.hasFourWheels(car));
    }
    @Test
    public void carHasSeatBelts() {
        Boolean expected = true;
        Car car = new Car(4,4,true,true);
        Assertions.assertEquals(expected,CarInspectionService.hasSeatBealt(car));
    }
    @Test
    public void carHasAirBags() {
        Boolean expected = true;
        Car car = new Car(4,4,true,true);
        Assertions.assertEquals(expected,CarInspectionService.hasAirbags(car));
    }
    @Test
    public void carHasDoorsReturnsTrueIfCarDoorAre3or5(){
        Boolean expected = true;
        Car car = new Car(4,3,true,true);
        Assertions.assertEquals(expected,CarInspectionService.CheckDoors(car));
    }
    @Test
    public void CheckCarTest(){
        Boolean expected = true;
        Car car = new Car(4,5,true,true);
        Assertions.assertEquals(expected,CarInspectionService.CheckCar(car));
    }

}
