package com.practisebasics.advancedjavaconcepts;
import java.util.List;
import java.util.*;
public class SecondHighestSalary {

	public static void main(String[] args) {
		int i;
		/*
		 * Employee ob1 = new Employee(1, "suzie", 56000); Employee ob2 = new
		 * Employee(1, "Ariana", 34000); Employee ob3 = new Employee(1, "Birza", 78000);
		 * Employee ob4 = new Employee(1, "Sila", 78000); Employee ob5= new Employee(1,
		 * "Fretta", 34000); Employee ob6 = new Employee(1, "Aliza", 670000);
		 */
		List <Employee> list = new ArrayList <>(Arrays.asList(new Employee(1, "suzie", 56000), new Employee(1, "Ariana", 34000), new Employee(1, "Birza", 78000), new Employee(1, "Sila", 78000), new Employee(1, "Fretta", 34000), new Employee(1, "Aliza", 670000)));
		double highestSalary = 0, secondHighestSalary = 0;
		for(i = 0;i<list.size();i++) {
			if(list.get(i).salary()>=highestSalary) {
				secondHighestSalary = highestSalary;
				highestSalary = list.get(i).salary();
			}else if((list.get(i).salary()<highestSalary)&&(list.get(i).salary()>secondHighestSalary)){
				secondHighestSalary = list.get(i).salary();
			}
		}
		System.out.println("secondHighestSalary="+secondHighestSalary);
		System.out.println("highestSalary="+highestSalary);
		
		
		
		

	}

}
