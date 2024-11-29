package org.neuefische.Groupetaskpackages.SetListAufgebar.MedicationTask;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //fake medication names provied by Chatgpt jegwediche änlichkeit mit echten Unternehmen und Medicarmenten
        //sind Zufall
        Medication medication =new Medication("Panacurex",10.0,true);
        Medication medication2 =new Medication("Thermivax",25.0,false);
        Medication medication3 =new Medication("Neurofenix",15.0,true);
        Map<String,Medication>medicationMap =new HashMap<String,Medication>();
        medicationMap.put("Panacurex",medication);
        medicationMap.put("Thermivax",medication2);
        medicationMap.put("Neurofenix",medication3);
        Pharmacy pharmacy =new Pharmacy(medicationMap);
        pharmacy.getCount();
        Medication medication5=pharmacy.findMedication("Panacurex");
        System.out.println(medication5+"\n");
        pharmacy.printAllMedications();
        pharmacy.delete("Thermivax");
        pharmacy.printAllMedications();
        pharmacy.save(new Medication("Allerzan",10.0,false));
        pharmacy.printAllMedications();

    }
}
