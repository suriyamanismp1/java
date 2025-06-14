import java.util.*;
public class BankTransaction {
    public static void main(String[] args){
        int w = 0, d = 0;
        Scanner s=new Scanner(System.in);
        for(int i=0;i<4;i++) {
            char c = s.next().charAt(0);
            switch (c){
                case 'w':{
                    int m=s.nextInt();
                    w+=m;
                    break;
                }
                case 'd':{
                    int m=s.nextInt();
                    d+=m;
                    break;
                }
            }
        }
        System.out.println(d-w);
    }
}
