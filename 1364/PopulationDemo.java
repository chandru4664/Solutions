package com.htc.javabasics;

public class PopulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long populn = 600000000l;
long newpop = 0L;
long totalpop = 0l;
boolean firstt = true;

System.out.println("total population in 2000 " + populn);
    for(int i=2001; i<=2010; i++) {
	
	if (firstt) {
		newpop = populn / 100;
		totalpop = 	newpop + populn;	
		firstt = false;
		System.out.println("total population in " + i + ":" + totalpop);
		
	}
		else {
			newpop = totalpop / 100;
			totalpop = 	newpop + totalpop;	
			
			System.out.println("total population in " + i + ":" + totalpop);				
			
		}
	}

	
}

	}


