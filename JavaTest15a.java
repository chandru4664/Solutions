package com.htc.core.java.day1;

public class JavaTest15a {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int[] storeOddNumbers = new int[20];
		int count = 0;
		int countOfOddInEvenPositions = 0;
		System.out.print("Odd Numbers between 1 to 20 : ");
		for (int i= 0,j=0 ; i< numbers.length ; i++,j++)
		{
			if (!(numbers[i] % 2 == 0))
			{
				System.out.print(numbers[i]);

				storeOddNumbers[j] = numbers[i];
				count++;
				j--;
				System.out.print(",");
			}

		}
		System.out.println("\n"+"count of Odd Numbers:" + count);
		System.out.print("OddInEvenPositions:");
		for (int z=1; z < count; z++)
		{
			if (storeOddNumbers[z]%3 == 0)
			{
				System.out.print(storeOddNumbers[z]);
				System.out.print(",");
				countOfOddInEvenPositions++;
			}
			z++;
		}
		System.out.println("\n"+"countOfOddInEvenPositions:"+countOfOddInEvenPositions);
	}

}
