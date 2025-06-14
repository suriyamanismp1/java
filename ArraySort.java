package TERV;
//sorting the String

import java.util.Scanner;

public class ArraySort {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String temp="";
        String[] c =s1.split(" ");
        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                if(c[i].compareTo(c[j])>0){
                    temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
        }
        for(String h:c){
            System.out.println(h);
        }
    }
}
