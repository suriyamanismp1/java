package TERV;

import java.util.Scanner;

public class Pattern_2 {
    public static void main(String []args){
        System.out.println("Enter the number :");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
