package com.company;

public class SomeClass {
    private static int classCounter=0;
    private final int instanceNumber;
    private final String name;
    public SomeClass(String name) {
        this.name=name;
        instanceNumber=++classCounter;
        System.out.println(name+"created, instance is "+instanceNumber);
    }
    public int getInstanceNumber() { return instanceNumber; }
}
