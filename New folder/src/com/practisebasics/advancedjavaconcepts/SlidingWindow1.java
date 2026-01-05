package com.practisebasics.advancedjavaconcepts;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class SlidingWindow1 {

	public static void main(String[] args) {
		int i, sum = 0, max_sum = 0, n=8;
		List <Integer> list = new ArrayList <Integer>(Arrays.asList(12,34,56,900,1,34,-1000, 89,45,67,-90));
		if(list.size()< n) {
			return;
		}else {
			for(i=0; i<n;i++) {
				sum += list.get(i);}
			max_sum = sum;
			for(i=n;i<list.size();i++) {
				sum +=list.get(i)-list.get(i-n);
			System.out.println("current sum="+sum);
			if(sum> max_sum) {
				max_sum = sum;
			}}
			System.out.println("Maximu sum is ="+ max_sum);
			
		} 

	}

}
