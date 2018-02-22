package com.htc.HadoopJava.day1;

/* by Narayana Tangudu 
 * EMP ID: 1580
 * Current world population (in 2000) is 6 billion. If the population increases by 1% every year, what will be
 * the population in 2010
 */
public class WorldPopulation {

	public static void main(String[] args) {
		
		long current = 6000000000L; //population (in 2000) is 6 billion
		long annual;
		int year = 2001;
		while(year<=2010) // Looping
		{
			annual = current + (current * 1/100);
			current = annual;
			System.out.println("Population for " + year + " is " + current);
			year = year +1;
		}
	}

}


Answer is as below.
Population for 2001 is 6060000000
Population for 2002 is 6120600000
Population for 2003 is 6181806000
Population for 2004 is 6243624060
Population for 2005 is 6306060300
Population for 2006 is 6369120903
Population for 2007 is 6432812112
Population for 2008 is 6497140233
Population for 2009 is 6562111635
Population for 2010 is 6627732751
	
	
