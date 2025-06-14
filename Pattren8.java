import java.util.*;
public class Pattren8 {
    public static void main(String[] args){
    int n=6;
    for(int i=1;i<=n;i++){
        for(int j=1;j<i*2;j++){
            if(j%2==0){
                System.out.print("* ");
            }
            else{
                System.out.print(j+" ");
            }
        }
        System.out.println();
    }
    }
}
