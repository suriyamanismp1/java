package javaCourse;

import java.util.*;
public class Array3 {
    public static void main(String []args){
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("The original array is: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The transpone Array is");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}
