package org.neuefische.MapsAndHashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "A");
        map.put(2, "B");
        System.out.println(map.size());
        System.out.println(map.get(1));
        map.remove(2);
        System.out.println(map.get(2));
        System.out.println(map.values().toString());

        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println("xxx");
        System.out.println(set.size());
        set.add(1);
        System.out.println(set.size());
        System.out.println("xxx");
        System.out.println(set.stream().filter(x -> x == 2).count());
        Set<String> set2 = new TreeSet<>();
        set2.add("this is BTest");
        set2.add("this is ATest");
        set2.add("this is CTest");
        for (String s : set2) {
            System.out.println(s);
        }
       Set<String>myHash= new HashSet<String>();
        String apple="apple";
        myHash.add(apple);
        myHash.add("kiwi");

        System.out.println(myHash.size());
        myHash.add("kiwi");
        System.out.println(myHash.size());
        for (String s : myHash) {
            System.out.println(s);
        }
        Map<Car,Integer> map2 = new HashMap<>();
        map2.put(new Car(1,"benz"),1);
        System.out.println(map2.size());
        map2.put(new Car(1,"benz"),2);
        System.out.println(map2.size());
    }
}
