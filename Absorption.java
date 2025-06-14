package javaProgram;

import java.util.*;
abstract class Mark{
    abstract void getper();
}
class A extends Mark{
    double sum;
    Scanner s=new Scanner(System.in);
    public void getper(){
        sum=0.0;
        int a[]=new int[3];
        for(int i=0;i<3;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<3;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);

    }
}
class B extends A{

    public void getper(){
        double add=0.0;
        int b[]=new int[4];
        for(int i=0;i<3;i++){
            b[i]=s.nextInt();
        }
        for(int i=0;i<4;i++){
            add=add+b[i];
        }
        add=add/4;
    }
}
public class Absorption {
    public static void main(String []args){

        A obj1=new B();
        obj1.getper();
        System.out.println(obj1.sum);
        B obj=new B();
        obj.getper();
    }
}
