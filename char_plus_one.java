package suriya;
import java.io.*;
public class char_plus_one{
	public static void main(String[]args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String a=br.readLine();
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)=='Z'||a.charAt(i)=='z')
				System.out.print((char)(((int)a.charAt(i))-26+n));
			else if((a.charAt(i)>='A' && a.charAt(i)<'Z')||(a.charAt(i)>='a'&&a.charAt(i)<'z'))
				System.out.print((char)(((int)a.charAt(i))+n));
			else
				System.out.print(a.charAt(i));
		}
	}
}