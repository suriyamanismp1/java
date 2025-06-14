package suriya;
import java.io.*;
public class emp_Previous_Exceeded {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int c=0;
		int temp=0;
		for(int i=0;i<n;i++)
		{
			int a=Integer.parseInt(br.readLine());
			if(a>temp)
			{
				c++; 
				temp=a;
			}
		}
		System.out.println(c);
	}

}
