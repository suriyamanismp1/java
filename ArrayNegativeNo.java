package TERV;

import java.util.Scanner;

public class ArrayNegativeNo {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean bc=false;

        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }

        for(int i=0;i<n;i++){
            if(a[i]<0){
                System.out.println("The negative element is "+a[i]);
                bc=true;
            }
        }
        if(bc==false){
            System.out.println("The negative not found ");
        }
    }
}
