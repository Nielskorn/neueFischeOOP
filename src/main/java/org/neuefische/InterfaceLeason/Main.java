package org.neuefische.InterfaceLeason;

public class Main {
    public static void main(String[] args) {
        Voilin voilin =new Voilin("violine1");
        EGitarre egitarre =new EGitarre("egitarre1");
        Screwdriver screwdriver =new Screwdriver();
        System.out.println(voilin.makeNoise());
        recordNoise(voilin);
        recordNoise(egitarre);
        recordNoise(screwdriver);
    }
    private static void recordNoise(CanMakeNoise noise) {
        System.out.println("start record noise::");
        System.out.println(" recording Instrument: " + noise.makeNoise());
        System.out.println("stop record noise::");
    }
}
