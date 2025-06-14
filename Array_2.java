import java.util.*;
public class Array_2 {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]={1,2,3,4,5};
        for(int i:a){
            System.out.print(i+" ");
        }
        for(int i=0;i<n;i++){
            int last=a[a.length-1];
            for(int j=a.length-1;j>0;j--){
                a[j]=a[j-1];
            }
            a[0]=last;
        }
        System.out.println();
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
