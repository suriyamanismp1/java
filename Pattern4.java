import java.util.*;
public class Pattern4 {
    public static void main(String[] arg){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
