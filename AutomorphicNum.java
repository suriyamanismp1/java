/*
num=76
76*76=>2576=>The last two digit number must same
This number is AutomorphicNumber
 */
import java.util.*;
public class AutomorphicNum {
    public static void main(String[] args){
        System.out.println("Enter the number :");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=n;
        n=n*n;
        n=n%100;
        if(n==m){
            System.out.println("The given number is Automorphic ");
        }
        else{
            System.out.println("The number is not automorphic");
        }
    }
}
