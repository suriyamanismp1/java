package Dk001;
    import java.util.*;

    public class DataTypesDemo{
        public static void main(String[] a){
            Scanner dk=new Scanner(System.in);

            System.out.println("Enter  your name ");
            String name=dk.next();
            System.out.println("Enter your rollno ");
            long rollno=dk.nextLong();

            System.out.println("Enter your mailid ");
            String mailid=dk.next();

            System.out.println("Enter your phoneNo ");
            long phoneNo=dk.nextLong();

            System.out.println("enter your amount ");
            int amount=dk.nextInt();
            System.out.println("hi "+name);
            System.out.println(rollno);
            System.out.println(mailid);
            System.out.println(phoneNo);
            System.out.println("your amount is dk"+amount);
        }
    }


