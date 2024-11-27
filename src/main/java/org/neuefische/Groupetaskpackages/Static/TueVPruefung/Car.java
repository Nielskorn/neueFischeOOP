package org.neuefische.Groupetaskpackages.Static.TueVPruefung;

import java.util.Objects;

public class Car {
   private int numbersofTires;
    private int numbersofDoors;
    private boolean seatBelt;
    private boolean airbag;

    public Car() {
    }



    public Car(int numbersofTires, int numbersofDoors, boolean seatBelt, boolean airbag) {
        this.numbersofTires = numbersofTires;
        this.numbersofDoors = numbersofDoors;
        this.seatBelt = seatBelt;
        this.airbag = airbag;
    }

    public int getNumbersofTires() {
        return numbersofTires;
    }

    public void setNumbersofTires(int numbersofTires) {
        this.numbersofTires = numbersofTires;
    }

    public int getNumbersofDoors() {
        return numbersofDoors;
    }

    public void setNumbersofDoors(int numbersofDoors) {
        this.numbersofDoors = numbersofDoors;
    }

    public boolean isSeatBelt() {
        return seatBelt;
    }

    public void setSeatBelt(boolean seatBelt) {
        this.seatBelt = seatBelt;
    }

    public boolean isAirbag() {
        return airbag;
    }

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return numbersofTires == car.numbersofTires && numbersofDoors == car.numbersofDoors && seatBelt == car.seatBelt && airbag == car.airbag;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numbersofTires, numbersofDoors, seatBelt, airbag);
    }
}
