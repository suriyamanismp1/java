package TERV;

import java.util.Scanner;

public class Pattern_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the  number :");
        int n = s.nextInt();

        int p = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print(p + " ");
                    p++;
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
