package com.practisebasics.advancedjavaconcepts;

public class RecursionSumofNaturalNo {
	public static int sumNaturalNo(int n) {
		if(n <= 0)return 0;
		return n+sumNaturalNo(n-1);
	}

	public static void main(String[] args) {
		int n = sumNaturalNo(3);
		System.out.println(n);

	}

}
