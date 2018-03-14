package buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacii {
	public static void main(String[] args)throws IOException
	{
		int f= -1,s=1,r,count=1,num;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter how many no you want to print");
		num=Integer.parseInt(br.readLine());
		while (count<=num)
			{
				r= f+s;
				System.out.println("The r value is " +r);
		        f=s;
		        s=r;
				count++;
				}
        
	} 
}
