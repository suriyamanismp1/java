package TERV;

import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the odd number :");
        int n = s.nextInt();

        int p = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(p %2 + " ");
                p++;
            }
            System.out.println();
        }
    }
}

