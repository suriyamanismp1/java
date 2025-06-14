package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList items=new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        items.add(6);
        printDoubled(items);
        printDoubledobj(items);
    }
//    parameterized type
    private static void printDoubled(ArrayList<Integer> n){
        for(Integer i:n){
            System.out.println(i*2);
        }
    }
//    raw type generic
    private static void printDoubledobj(ArrayList n){
        for(Object i:n){
            System.out.println((Integer) i*2);
        }
    }
}
