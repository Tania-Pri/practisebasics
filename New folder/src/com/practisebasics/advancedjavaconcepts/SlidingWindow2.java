package com.practisebasics.advancedjavaconcepts;
import java.util.*;

public class SlidingWindow2 {

	public static void main(String[] args) {
		List <Integer> list = new ArrayList <>(Arrays.asList(19, 56, 43, 2, 1, 345, 5, 68, 90));
		int i, j=0, sum=0, k = 100, current_length =0;
		int min_length = Integer.MAX_VALUE;
		
		for(i = 0; i<list.size(); i++) {
			sum += list.get(i);
			while(sum >= k) {
				current_length= i-j+1;
				min_length = Math.min(current_length, min_length);
				sum -=list.get(j);
				j++;
			}
		} System.out.println(min_length);
		

	}

}
