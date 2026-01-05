package com.practisebasics.advancedjavaconcepts;

public class Recursion1 {
	
	public static int sum(int n) {
		if(n<=0) return n;
		return n + sum(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int ans = sum(3);
    System.out.println(ans);	}

}
