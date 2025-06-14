/*
enter the number 145
=> 1!+4!+5!
=> 1+24+120
=> 145=145
 */
import java.util.*;
public class PotersonNum {
    public static void main(String []args){
        System.out.println("Enter the number :");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int add=0;
        int m=n;
        while(n!=0){
            int fact=1;
            int d=n%10;
            for(int i=1;i<=d;i++){
                fact*=i;
            }
            add+=fact;
            n=n/10;
        }
        if(add==m){
            System.out.println("The number is poterson number");
        }
        else{
            System.out.println("The number is not poterson number");
        }
    }
}
