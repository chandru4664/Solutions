package com.htc.corejava.customer;

public abstract class Q1E extends Q1{

	@Override
	public void testOverride(String s) {
		System.out.println("testOverride" + s);
	}
	
	public final void  testFinal(String s) {
		s = "Change S";
		System.out.println("testFinal" + s);
	}
	
	/*public static void main(String[] args) {
		Q1E q1E = new Q1E();
		q1E.testFinal("Old Value");
	}*/
	//public abstract final void calculate(double d1, double d2) ;
	/*public volatile void calculate(double d1, double d2) {
		
	}*/
	/*public void static calculate(double d1, double d2) {
		
	}*/
	
	public void testOverride(String s, String s1) {
		System.out.println("testOverride" + s);
	}
}
