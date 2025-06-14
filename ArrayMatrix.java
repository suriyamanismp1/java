package TERV;

import java.util.Scanner;

public class ArrayMatrix {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the numbers :");
        int n=s.nextInt();
        int n1=s.nextInt();

        int a[][]=new int[n][n1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n1;j++){
                a[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n1;j++){
                for(int k=0;k<n1;k++){
                    a[i][j]=a[i][k]*a[k][j];
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n1;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
