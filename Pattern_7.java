package TERV;

import java.util.Scanner;

public class Pattern_7 {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=s.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j%2==1){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
