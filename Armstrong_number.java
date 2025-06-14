package Dk001;

import java.io.*;
import java.lang.Math;
import java.util.Scanner;
public class Armstrong_number {
    static boolean isArmstrong(int n){
        int temp,sum=0,last=0,digits=0;
        temp=n;


        while(temp>0){
            temp=temp/10;
            digits++;
        }
        temp=n;
        while(temp>0){
            last=temp%10;
            sum+=(Math.pow(last,digits));
            temp=temp/10;
        }
        if(n==sum)
            return true;
        else
            return false;

        }
        public static void main(String[] args){
        int num;
        Scanner sc=new Scanner(System.in);
            System.out.print("enter the limits:");
            num= sc.nextInt();
            for(int i=0;i<=num;i++){
                if(isArmstrong(i))
                    System.out.println(i+",");

            }
        }
    }

