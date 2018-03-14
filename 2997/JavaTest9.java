package com.htc.core.java.day1;

public class JavaTest9 {

	public static void main(String[] args) {
		int [] [] salaryComponents = {
				{1000, 2000, 3000, 4000, 5000 }, //Basic
				{1500, 2500, 3500, 4500, 5500 }, //DA
				{2000, 3000, 4000, 5000, 6000 }, //HRA
		};

		int component = 0;
		int avgOfComponent = 0;

		// Average and total for Basic/DA/HRA salary of employee

		for (int i =0; i < salaryComponents.length ; i++)
		{
			int sumOfComponent = 0; 
			for (int j =0; j < salaryComponents[i].length;j++)
			{
				component = salaryComponents[i][j];
				sumOfComponent = sumOfComponent+component;
				avgOfComponent = sumOfComponent/5;
			}
			if ( i==0 )
			{
				System.out.println("Sum Of Basic:"+sumOfComponent);
				System.out.println("Avg Of Basic:"+avgOfComponent);
			}
			else if(i==1)
			{
				System.out.println("Sum Of DA   :"+sumOfComponent);
				System.out.println("Avg Of DA   :"+avgOfComponent);
			}
			else 
			{
				System.out.println("Sum Of HRA  :"+sumOfComponent);
				System.out.println("Avg Of HRA  :"+avgOfComponent);
			}
		}

	}

}
