package com.practisebasics.advancedjavaconcepts;

public class Recursion1 {
	public static int sum= 0;
	public static int fact(int n) {
		if(n==1) {
			return 1;
		}
		//System.out.print("head recursion"+n);
		sum +=n;
	
		return  fact(n-1);
	}

	public static void main(String[] args) {
		
		sum = fact(3);

	}
	

}
