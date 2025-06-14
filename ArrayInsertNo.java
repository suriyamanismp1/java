package TERV;

import java.util.Scanner;

public class ArrayInsertNo {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=s.nextInt();
        int temp;

        int a[]=new int[n+1];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.println("Enter index number :");
        int b=s.nextInt();
        System.out.println("Enter the insert value :");
        int c=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                a[b]=a[c];
                if(a[i]==a[b]){

                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

    }
}
