import java.util.*;
public class VaporCode {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        str=str.toLowerCase();
        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length;i++) {
            if (!Character.isSpace(arr[i])) {
                System.out.print(Character.toUpperCase(arr[i]) + " ");
            }
        }
    }
}
