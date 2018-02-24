package com.htc.core.java.day1;

public class JavaTest14b {

	public static void main(String[] args) {
		for (int i = 1,j=1; i<10 ;i++,j++)
		{
			if(j%2 == 0)
			{
				System.out.print("-"+ i);
			}
			else
			{
				System.out.print(i);
			}

			System.out.print(",");
			i++;

		}
	}

}
