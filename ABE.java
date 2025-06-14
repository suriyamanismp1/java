
    import java.util.Scanner;
 public class ABE
    {
        public static void main(String args[])
        {

            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            float f=s.nextFloat();
           // float a=10.15f;
            if(n>13&&f==10.15)
                System.out.println("$8.00");
            else if(n>18&& f==13.50||f==18.00||f==22.00)
                System.out.println("$5.00");
            else if(n<13 && f==10.15f)
                System.out.println("$4.00");
        }
    }


