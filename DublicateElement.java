import java.util.*;
public class DublicateElement {
    public static void main(String[] args){
        int a[]=new int[]{1,2,3,4,5,6,1,2,3,9};

        System.out.println("The dublicate values are :");
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }
}
