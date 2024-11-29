package org.neuefische.MapsAndHashSet;

import java.util.Objects;

public class Car {
    int carId;
    String carName;

    public Car(int carId, String carName) {
        this.carId = carId;
        this.carName = carName;
    }

    public int getCarId() {
        return carId;
    }



    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return carId == car.carId && Objects.equals(carName, car.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carId);
    }
}
