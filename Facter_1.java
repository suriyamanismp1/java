package TERV;

import java.util.Scanner;

public class Facter_1 {
    public static void main(String[] args) {
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number :");
            int n = s.nextInt();

            System.out.println("The factor value is ");
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(" " + i);
                }
            }
            System.out.println();
        }
    }
}