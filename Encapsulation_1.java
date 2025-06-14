package javaProgram;

import java.util.Scanner;

public class Encapsulation_1 {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String a[]=new String[n];
        String b[]=new String[n];
        String c[]=new String[n];
        for(int i=0;i<n;i++){
            a[i]=s.next();
            b[i]=s.next();
            c[i]=s.next();
        }
        String str=s.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Employee name :"+a[i]);
            System.out.println("Employee Id :"+b[i]);
            System.out.println("Employee Salary :"+c[i]);
            System.out.println("Employee company name : ABC Crop");
        }
        System.out.println("Updated Details :");
        for(int i=0;i<n;i++){
            System.out.println("Employee name :"+a[i]);
            System.out.println("Employee Id :"+b[i]);
            System.out.println("Employee Salary :"+c[i]);
            System.out.println("Employee company Name :"+str);
        }

    }
}
