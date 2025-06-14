package TERV;

import java.util.Scanner;

public class Pattern_13 {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=s.nextInt();

        int num=1;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                int value=num+i-1;
                for(int j=1;j<=i;j++){
                    System.out.print(value+" ");
                    value--;
                    num++;
                }
            }
            else{
                for(int j=1;j<=i;j++){
                    System.out.print(num+" ");
                    num++;
                }
            }
            System.out.println();
        }
    }
}
