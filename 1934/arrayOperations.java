package com.htc.javatraining.exercises;

public class arrayOperations {
	
	public static void main(String[] args) {
		
		int intArray[] = {5,9,10,45,21,99,36,76,86,23,39,89,61,100,4,150};
		
		//count the number of odd numbers divisible by 3 in even positions
		int oddNumCounter = 0;
		
		for(int i = 0; i < intArray.length; i++) {
			if((i % 2 == 0) && (intArray[i] % 2 != 0) && (intArray[i] % 3 ==0)) {
				oddNumCounter++;
			}
		}
		System.out.println("Number of odd numbers divisible by 3 in even positions: " + oddNumCounter);
		
		//search for a key value in array and print it is available in the array or not
		int keyValue = 76;
		boolean isAvailable = false;
		
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] == keyValue) {
				isAvailable = true;
				break;
			}
		}
		if (isAvailable) {
			System.out.println("The key value " + keyValue + " is in the array");
		} else {
			System.out.println("The key value " + keyValue + " is not in the array");
		}
		
		//count the number of prime numbers 
		int totPrimeNum = 0;
		for (int i = 0; i < intArray.length; i++) {
			boolean isPrime = true;
			if (intArray[i] > 1) {							//0 and 1 are not prime
				for(int j = 2; j < intArray[i]; j++) {
					if (intArray[i] % j == 0) {
						isPrime = false;
						break;
					}
				}
			}
			if (isPrime) {
				totPrimeNum++;
			}
		}
		System.out.println("Total prime numbers in the array are: " + totPrimeNum);
	}

}
