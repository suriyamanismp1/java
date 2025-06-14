package Dk001;

public class inherit_1 {
   inherit_1() {
        System.out.println("hfgahjfg");
    }


    public void b() {
        System.out.println("jhjvhdbv dvbf,j");
    }
}

    class b extends inherit_1{
        b(){
            System.out.println("ghaggge");
        }
    }
    class c{
    public static void main(String[] args){
        b dh=(b) new inherit_1();
        dh.b();
    }
    }


