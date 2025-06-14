package com.company._static;
public class StaticTest {
    private static int numInstanc=0;
    private  String name;
    public StaticTest( String name) { numInstanc++;this.name = name; }
    public static int getNumInstanc() { return numInstanc; }
    public  String getName() {return name;}
}
