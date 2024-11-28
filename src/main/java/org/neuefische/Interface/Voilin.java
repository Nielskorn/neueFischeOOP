package org.neuefische.Interface;

public class Voilin extends Instrument {

    public Voilin(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return "Voilin music";
    }
}
