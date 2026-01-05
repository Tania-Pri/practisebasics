package com.practisebasics.advancedjavaconcepts;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MaximumSumSubArrayContiguous {

	public static void main(String[] args) {
		
		int i = 0, j, p, count = 4, sum = 0, max_sum = 0;
		List <Integer> list = new ArrayList<Integer>(Arrays.asList(120,78,200,90,100,45,3,-100,20,9,78));
		int n = 4;
		for(i = 0; i<= list.size()-n; i++) {
			p = i;
			sum = 0;
			for(j=1;j<=count;j++) {
				sum += list.get(p++);
				
			}
			if(sum >= max_sum) {
				max_sum = sum;
			}
		}
System.out.println(max_sum);
	}

}
