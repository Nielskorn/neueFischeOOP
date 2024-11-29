package org.neuefische.InterfaceLeason;

public class Voilin extends Instrument {

    public Voilin(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return "Voilin music";
    }
}
