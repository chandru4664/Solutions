package buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorialloop {
	public static void main(String[] args) throws IOException
	{
		int fact=1,count=1,num;
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("enter the value of x");
		num=Integer.parseInt(br.readLine());
		while( count<=num)
		{
			fact*= count;
			count++;
           
		}
		System.out.println("the value is  " +fact);
	}
}
