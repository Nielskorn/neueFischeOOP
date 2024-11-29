package org.neuefische.InterfaceLeason;

public class Instrument implements CanMakeNoise {
    String name;
    public Instrument(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String makeNoise() {
        return name + " noise";
    }

    @Override
    public String StopNoise() {
        return name+"stop making noise"  ;
    }
}
