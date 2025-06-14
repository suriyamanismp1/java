package TERV;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

//perfect number
public class Facter_2 {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=s.nextInt();
        int sum=0;

        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
        if(n==sum){
            System.out.println("The number is perfect number");
        }
        else
            System.out.println("The number is not perfect number");
    }
}
