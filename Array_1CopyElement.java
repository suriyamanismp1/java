import java.util.*;
public class Array_1CopyElement {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=a[i];
        }
        System.out.println("The original number is :");
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println("\nThe copy of another Array is ");
        for(int i:b){
            System.out.print(i+" ");
        }
    }
}
