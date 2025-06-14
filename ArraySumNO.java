package TERV;

import java.util.Scanner;

public class ArraySumNO {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }

        for(int i=0;i<n;i++){
            b[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a.length!=b.length){
                System.out.println("Length is required ");
            }
            if(a.length==b.length){
                c[i]=a[i]+b[i];
            }
        }
       for(int i=0;i<a.length;i++){
           System.out.println(c[i]+" ");
       }
    }
}
