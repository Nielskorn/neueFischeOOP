package org.neuefische.Groupetaskpackages.SetListAufgebar.MedicationTask;

import java.util.Objects;
import java.util.UUID;

public class Medication {
    private final UUID id;

    private String name;
    private double price;
    private boolean available;

    public Medication( String name, double price, boolean available) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.price = price;
        this.available = available;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public double getPrice() {
        return price;
    }
    public boolean isAvailable() {
        return available;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Medication that = (Medication) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public String toString() {
        return "Medication{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", Available=" + available +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
