package TERV;

import java.util.Scanner;

public class Pattern_11 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=s.nextInt();

        for(int i=1;i<=n;i++){
            int p=i;
            for(int j=1;j<=i;j++){
                System.out.print(p+" ");
                p=p+n-j;
            }
            System.out.println();
        }
    }
}
