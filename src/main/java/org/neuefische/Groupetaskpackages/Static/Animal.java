package org.neuefische.Groupetaskpackages.Static;

public class Animal {
    static int totalCount=0;
    int  instanceCount=0;


    public static int incrementTotalCount(){
        totalCount++;
        return totalCount;
    }
    public int incrementInstanceCount(){
        instanceCount++;
        return instanceCount;
    }

    @Override
    public String toString() {
        return "Animal [totalCount=" + totalCount + ", instanceCount=" + instanceCount + "]";
    }
}
