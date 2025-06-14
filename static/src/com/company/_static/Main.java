package com.company._static;
public class Main {
    public static int multiplier=7;
    public static void main(String[] args) {
//	      StaticTest firstInstance=new StaticTest("1st Instance");
//        System.out.println(firstInstance.getName()+" is instance number "+ StaticTest.getNumInstanc());
//        StaticTest secondInstance =new StaticTest("2nd Instance");
//        System.out.println(secondInstance.getName()+" is instance number "+secondInstance.getNumInstanc());
        Main mul=new Main();
        System.out.println("answer"+multiply(6,multiplier));
    }
    public static int multiply(int number,int mul){
        return number*mul;
    }
}
