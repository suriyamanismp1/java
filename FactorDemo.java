import java.util.Scanner;

public class FactorDemo {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;

        for(int i=1;i<=n;i++){
            if(n%i==0) {
                sum=sum+i;
                System.out.println("The factor of number is  "+sum/2);
            }
        }
    }
}
