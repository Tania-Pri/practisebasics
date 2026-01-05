package com.practisebasics.advancedjavaconcepts;
import java.util.Set;
import java.util.HashSet;

public class SlidingWindow3 {

	public static void main(String[] args) {
		int max_length = Integer.MIN_VALUE;
		int a =0, current_length =0;
		String string = "aasnvjfjrfhdjkdfnfnfjkgkghm";
		Set <Character> set = new HashSet <>();
		for(int i = 0; i< string.length(); i++) {
			while(set.contains(string.charAt(i))) {
				set.remove(string.charAt(a));
				a++;
			} set.add(string.charAt(i));
			current_length = i-a+1;
			max_length = Math.max(max_length, current_length);
			
		} System.out.println(max_length);

	}

}
