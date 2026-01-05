package com.practisebasics.advancedjavaconcepts;

public class RecursionBasic {

	public static void main(String[] args) {
      printNumber(4);

	}
	public static void printNumber(int n) {
		if(n == 0) return ;
		printNumber(n-1);
		System.out.println(n);
	}
	public static void string(String a) {
		if(a.isEmpty()) return;
		string(a);
	}

}
