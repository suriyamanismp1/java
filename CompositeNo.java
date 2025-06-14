package TERV;

import java.util.Scanner;

public class CompositeNo {
    public static void main(String[] args) {
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number ");
            int n = s.nextInt();
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
//                System.out.print(i);
                    count++;
                }
            }
            if (2 < count) {
                System.out.println("The number is Composite number");
            } else
                System.out.println("Not Composite number");
        }
    }
}