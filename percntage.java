import java.util.Scanner;

public class percntage {
    public static void main(String[] args){
        Scanner bb=new Scanner(System.in);
        int a =bb.nextInt();
        int b=bb.nextInt();
        int c=bb.nextInt();
       int  second=b*a/100;
       int third = a- second;
       int fourth=c*third/100;
       int fivth=a-(second+fourth);
       int sixth=fivth/3;


        System.out.println(second);
        System.out.println(fivth);
        System.out.println(sixth);


    }
}
