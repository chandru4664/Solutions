package com.htc.corejava.exercises;

public class SeriesLogic {

	public static void main(String[] args) {
		
	SeriesLogic SeriesLogic = new SeriesLogic();
		SeriesLogic.printSeries(4, 20);
		System.out.println();
		SeriesLogic.printSeries2(1, 20);
	}
	
	private void printSeries(int increment, int numOfTimes) {
		
		int i=1;
		int j=-3;
		int counter;
		
		for(counter = 1; counter < numOfTimes; counter++) {
			
			System.out.print(i + ",");
			i= i + increment;
			
			if(counter == numOfTimes - 1) {
				System.out.print(j);
			}else {
				System.out.print(j + ",");
				j = j - increment;
			}
		}
			
	}

private void printSeries2(int increment, int numOfTimes) {
		
		int i=1;
		
		int counter;
		
		for(counter = 1; counter < numOfTimes; counter++) {
			if(counter == numOfTimes - 1) {
				System.out.print(1 + "/" + i);
			}else {
				System.out.print(1 + "/" + i + ",");
				i= i + increment;
			}
		}
			
	}

}
