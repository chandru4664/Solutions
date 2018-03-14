package com.htc.coreexercise.beginers;

/*
 * 15.) Consider an array and perform the below operations
(a) Count the number of odd numbers divisible by 3 in even positions.
(b) Search for a key value in array and print it is available in the array or not.
(c) Count the number of prime numbers.
 */

public class ArrayOperations {

	public static void main(String[] args) {
		
	int[] arrNew = new int[] {5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	int searchValue=13;
	
	
	for(int i=0;i<arrNew.length-1;i=i+2) { // i=i+2 ensures that only numbers form the even positions are iterated
		if(arrNew[i] % 2!=0) { // checking if the number is odd
			if(arrNew[i] % 3==0) {// checks if the number is divisible by 3
				System.out.println("position in the array = " + i + " Value = "  + arrNew[i]);
			}
		}
	}
	for(int i=0;i<arrNew.length-1;i++) {
		if (arrNew[i]==searchValue)	{ System.out.println("Value " + searchValue + " found at position " + i );
		break;
		}
	}
	int temp;
	int primeCounter=0;
	
	for(int i=0;i<arrNew.length-1;i++) {
		boolean isPrime= true;
		
		if (arrNew[i]!=0 && arrNew[i]!=1)
			{
				//System.out.println(arrNew[i]/2);
				for(int j=2;j<=arrNew[i]/2;j++)
				{
			       temp=arrNew[i]%j;
				   if(temp==0)
				   {
				      isPrime=false;
				      break;
				   }
				}
				if (isPrime==true) 
				{
				primeCounter=primeCounter+1;
				}

			}
	}

		System.out.println("Number of prime Numbers = " + primeCounter);
	}
	

}
