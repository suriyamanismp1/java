package TERV;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayNo {
    public static void main(String []args){
        System.out.println("Enter the numbers :");
        Scanner s=new Scanner(System.in);
        int a[]=new int[10];
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(a));
    }
}
