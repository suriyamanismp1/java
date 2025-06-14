package TERV;

import java.util.Scanner;

public class ArraySort_2 {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        char temp;
        char c[]=s1.toCharArray();
        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                if(c[i]>c[j]){
                    temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
        }
        for(char i:c){
            System.out.print(i);
        }
    }
}
