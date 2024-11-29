package org.neuefische.InterfaceLeason;

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
