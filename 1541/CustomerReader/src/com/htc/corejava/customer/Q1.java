package com.htc.corejava.customer;

public class Q1 {

	public void testOverride(String s) {
		System.out.println("testOverride" + s);
	}
	
	protected void testOverride(String s, String s2) {
		String s3; 
		//s3.length();
		StringBuffer sb = new StringBuffer();
		sb.length();
		System.out.println("testOverride" + s);
	}
}
