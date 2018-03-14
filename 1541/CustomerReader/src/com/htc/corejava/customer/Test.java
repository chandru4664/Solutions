package com.htc.corejava.customer;

	public class Test {
		public static String output ="";
		
		public static void fetch (int i) {
		 try {
		if (i == 1) {
		 throw new Exception ();
		}
		output += "1";
		 }
		 catch(Exception e) {
		output += "2";
		return;
		 }
		 finally {
		output += "3";
		 }
		 output += "4";
		 }
		 public static void main(String args[]) {
		fetch(1);
		System.out.println(output);
		 } }

