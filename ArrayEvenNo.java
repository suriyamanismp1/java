package TERV;

import java.util.Scanner;

public class ArrayEvenNo {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                System.out.print(a[i]+" ");
            }
        }
    }
}
