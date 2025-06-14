package TERV;

import java.util.Scanner;

public class Pattern_9 {
    public static void main(String[] args) {
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number :");
            int n = s.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = i; j < n; j++) {
                    System.out.print("1 ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }
}