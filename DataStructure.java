package TERV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

//list
//set
//map
public class DataStructure {
    public static void main(String... args) {
        LinkedList fruits = new LinkedList();
        fruits.add("Dk");
        fruits.addAll(Collections.singleton(new int[]{1, 2, 3, 4, 5}));
//        System.out.println(fruits);

        ArrayList a1 = new ArrayList();
        // a1.addAll(Collections.singleton(new int[]{1,2,3,4,5,6}));
        a1.add("hello");
        a1.add(621);
        a1.add(1, "world");
        a1.add(34);
        a1.add(10);
        a1.get(2);
        a1.contains("hello");
        a1.size();
        //a1.remove(3);
       //     System.out.println(a1);
        for (Object i : a1) {
            System.out.println(i);
        }
        System.out.println("The size of elements "+a1.size());
        System.out.println( a1.contains("hello"));
        LinkedList<Integer> link=new LinkedList<Integer>();

    }
}
