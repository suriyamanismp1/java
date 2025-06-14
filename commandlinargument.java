package suriya;

public class commandlinargument {

	public static void main(String[] args) {
	System.out.println("The first args is: "+args[0]);
	System.out.println("The first args is: "+args[1]);
	System.out.println("The first args is: "+args[2]);
	System.out.println("The first args is: "+args[3]);
	int a=Integer.parseInt(args[4]);
	int b=Integer.parseInt(args[5]);
	System.out.println(a-b);
//	args[6]="hey";              not possiblent
//	System.out.println(args[6]);            not possible
	int _5=5;
	int _a=0;
	for(int i=1;i <= _5;i++)
	{
		_a+=i;
	}
	System.out.println(_a);
	int n=5;
	System.out.println((n*(n+1))/2);
	System.out.printf("%.0f",Math.pow(((n+1)/2),2));
	}

}
