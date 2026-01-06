package com.practisebasics.advancedjavaconcepts;

public class RecursionStringReversal {
	
	public static String reverse(String name, String reverseName) {
		if(name.isEmpty()) return name;
		//reverseName = reverseName.concat(name);
		 reverse(name.substring(1), reverseName);
		reverseName = reverseName.concat(name);
		 return reverseName;
	}

	public static void main(String[] args) {
		String reverseName = reverse("Tania", "");
		System.out.println(reverseName);
		

	}

}
