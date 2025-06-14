package TERV;

import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter the positive number :");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int count = 0, sum = 0;
            int m = n;
            int original = n;

            while (original != 0) {
                int d = original % 10;
                original = original / 10;
                count++;
            }
            while (n != 0) {
                int d = n % 10;
                sum = sum + (int) Math.pow(d, count);
                n = n / 10;
            }
            if (m == sum) {
                System.out.println("The number is Armstrong number\n");
            } else
                System.out.println("The number is not Armstrong number\n");
        }
    }

}