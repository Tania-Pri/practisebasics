package com.practisebasics.advancedjavaconcepts;

public class RecursionCountDigits {
	
	public static int countDigits(int n) {
		n = Math.abs(n);
		if(n<10)return 1;
		
		return 1 +countDigits(n/10);
	}

	public static void main(String[] args) {
		int sum = countDigits(-283999);
System.out.println(sum);
	}

}
