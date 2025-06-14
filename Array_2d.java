import java.util.Arrays;
import java.util.*;

public class Array_2d {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int a[][]=new int[n][n];
        int b[][]=new int[n][n];
        int c[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=s.nextInt();
                b[i][j]=s.nextInt();
            }
        }

        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    c[i][j] = a[i][k] * b[k][j];
                }
            }
        }

        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}
