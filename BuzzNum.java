import java.util.*;
public class BuzzNum {
    public static void main(String[] args){
        System.out.println("Enter the valid number :");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n%10==7 ||n%7==0){
            System.out.println("The number is buzzNumber ");
        }
        else{
            System.out.println("The number is not buzzNumber");
        }
    }
}
