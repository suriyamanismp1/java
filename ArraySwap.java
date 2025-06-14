package TERV;
//without another variable not used
import java.util.Scanner;

public class ArraySwap {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();

        n=m+n;
        m=n-m;
        n=n-m;
        System.out.println(n);
        System.out.println(m);
    }
}
