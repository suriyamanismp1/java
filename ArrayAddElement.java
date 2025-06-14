package Dk001;

import java.util.Arrays;

public class ArrayAddElement {
    public static void main(String[] args){
        int a[]={10,20,30,40};
        int l=a.length;
        int b[]=new int[l+3];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        b[l]=50;
        b[l+1]=60;
        b[6]=70;
        System.out.println("original array  "+ Arrays.toString(a));
        System.out.println("after Adding  "+Arrays.toString(b));
    }
}
