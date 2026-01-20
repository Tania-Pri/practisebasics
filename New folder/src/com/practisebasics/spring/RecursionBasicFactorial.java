package com.practisebasics.spring;

public class RecursionBasicFactorial {
	
	public static int fact(int n) {
		n = Math.abs(n);
		if(n == 1) return 1;
		return n * fact(n-1);
	}

	public static void main(String[] args) {
		int factorial= fact(-3);
		System.out.println(factorial);

	}

}
