package TERV;

import java.util.Scanner;

public class Pattern_12 {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=s.nextInt();
        int p=1;

        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(p+ " ");
                p++;
            }
            System.out.println();
        }
    }
}
