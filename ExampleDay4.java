class A{
    A(){
        System.out.println("The class is A");
    }
}
class B extends A{
    B(){
        System.out.println("The class is B");
    }
}
class C extends B{
    C(){
        System.out.println("The class is C");
    }
}
class D extends C{
    D(){
        System.out.println("The class is D");
    }
}

public class ExampleDay4{
    public static void main(String[] args){
        A a=new B();
        A a1=new C();
        A a2=new D();
    }
}