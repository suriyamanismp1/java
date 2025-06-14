package TERV;

public class WrapperClass_1 {
    public static void main(String []args){
        byte b=110;
        Byte B=new Byte(b);
        System.out.println(B);

        int in=1000;
        Integer I = new Integer(in);
        System.out.println(I);

        Integer I1;
        I1=new Integer(65);
        int a=I1.intValue();
        System.out.println(a);

        int d1=56;
        String str=Integer.toString(d1);
        System.out.println(str);

        String str1="6988767";
        Integer i1=Integer.valueOf(str1);
        System.out.println(i1);



    }
}
