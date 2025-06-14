import java.util.*;
public class HarshadNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value 1 the loop will be end");
        System.out.println("Enter the value 0 loop will be continued ");
        int a = s.nextInt();

        while (a != 1) {
            System.out.println("Enter the number :");
            int n = s.nextInt();
            int m = n;
            int sum = 0;
            while (n != 0) {
                int d = n % 10;
                sum += d;
                n = n / 10;
            }
            if (m % sum == 0) {
                System.out.println("The number is Harshad number \n");
            } else {
                System.out.println("The given number is not harshad number \n");
            }
        }
    }
}