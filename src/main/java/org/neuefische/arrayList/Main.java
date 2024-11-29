package org.neuefische.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
     List<String> names =new ArrayList<>();
     names.add("John");
     names.add("Jane");
     names.add("Bob");
     System.out.println(names.getFirst());
     names.remove("John");
     System.out.println(names.getFirst());
        for (String name:names) {
            System.out.println(name);

        }

    }
}
