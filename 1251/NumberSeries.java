package com.htc.coreexercise.beginers;
/*14.) Prepare the logic for the below series
(a) 1, -3, 5, -7....
(b) 1/1, 1/2, 1/3, 1/4.... 
*/
public class NumberSeries {

	public static void main(String[] args) {

		int seriesOne =1;
	
		for(int i=0;i<11;i++)
		{
			if (i%2 !=0)System.out.print("-" + seriesOne + ",");
			else System.out.print(seriesOne + ",");
			seriesOne=seriesOne+2;
		}
		System.out.println("");
		
		for(int i=1;i<11;i++)
		{
			System.out.print("1/" + i + ",");
			
		}
	
	}

}
