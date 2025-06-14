import java.util.*;
public class Array_4 {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=s.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0,j=n-1;i<n && j>=0;i++,j--){
            sum+=a[i]*b[j];
        }
        System.out.println(sum);
    }
}
