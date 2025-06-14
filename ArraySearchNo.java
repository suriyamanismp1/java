package TERV;

import java.util.Scanner;

public class ArraySearchNo {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=s.nextInt();
        boolean bc=false;

        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }

        System.out.println("Enter the search element in the list :");
        int b=s.nextInt();

        for(int i=0;i<n;i++){
            if(a[i]==b) {
                System.out.println("The element is " + a[i] +" is Here ");
                bc=true;
            }
        }
        if(bc==false){
            System.out.println("The element is not found");
        }
    }
}
