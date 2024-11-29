package org.neuefische.InterfaceLeason;

public class EGitarre extends Instrument {

    public EGitarre(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return "Egarre music";
    }
}
