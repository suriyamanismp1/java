import java.util.*;

public class FrequencyOfNnmber {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String []arr=str.split(" ");
        int fr[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].equals(arr[j])){
                    count++;
                    arr[j]="-1";
                }
                if(arr[i]!="-1"){
                    fr[i]=count;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!="-1"){
                System.out.println(arr[i]+" "+fr[i]);
            }
        }

    }
}
