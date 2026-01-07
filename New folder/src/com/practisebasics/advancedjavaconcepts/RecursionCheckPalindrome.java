package com.practisebasics.advancedjavaconcepts;

public class RecursionCheckPalindrome {
	public static String palindrome(String word) {
		if(word.isEmpty())
			return word;
		String newWord = palindrome(word.substring(1))+word.charAt(0);
		return word;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
