package org.neuefische.Interface;

public class Screwdriver implements CanMakeNoise {
    @Override
    public String makeNoise() {
        return "screwdriver noise";
    }

    @Override
    public String StopNoise() {
        return "no more screwdriver noise";
    }
}
