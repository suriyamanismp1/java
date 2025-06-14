package TERV;

import java.util.Scanner;

public class ArrayDeleteNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        int b = 20, c;

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == b) {
                    c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
            }
        }
       for(int i=0;i<n-1;i++){
           System.out.println(a[i]+" ");
       }
    }
}
