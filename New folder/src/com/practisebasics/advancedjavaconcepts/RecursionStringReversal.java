package com.practisebasics.advancedjavaconcepts;

public class RecursionStringReversal {
	
	public static String reverse(String name) {
		if(name.isEmpty()) return name;
		return reverse(name.substring(1))+name.charAt(0);
	}

	public static void main(String[] args) {
		String name = reverse("kazakistan madrid");
		System.out.println(name);
		

	}

}
