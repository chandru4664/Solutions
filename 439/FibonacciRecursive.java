package com.htc.corejava.day1;

public class FibonacciRecursive {
/* Written by Prasanna Mate
 * 24-Feb-2018.
 */
	public static class Fib {
		public static long f(int n ) {
			if (n <= 1)
				return n;
			else
				return f(n-2) + f(n-1);
		}
	}
}
