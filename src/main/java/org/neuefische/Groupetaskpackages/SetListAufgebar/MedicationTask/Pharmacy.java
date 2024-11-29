package org.neuefische.Groupetaskpackages.SetListAufgebar.MedicationTask;

import java.util.Map;

public class Pharmacy {
    public Pharmacy(Map<String, Medication> medications) {
        this.medications = medications;
    }

    private Map<String,Medication> medications;
    public int getCount() {
        return medications.size();
    }
    public void save(Medication m) {
        medications.put(m.getName(),m);
    }
    public void delete(String name) {
        medications.remove(name);
    }
    public Medication findMedication(String name) {
        return medications.get(name);
    }
    public void printAllMedications() {
        medications.forEach((k,v)->{
            System.out.println(v.toString());
        });
        System.out.println("\n");
    }

}
