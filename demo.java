package suriya;
class A
{
	 public  void d()
	   {
		   System.out.println("Class A");
	   }
}
class B extends A
{
   public  void c()
   {
	   System.out.println("Class B");
   }
}
public class demo  extends B{

	public static void main(String[] args) 
	{
	B  b= new B();
	b.c();
	b.d();
	}

}
