package com.project.euler.net;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Problem21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
//		If d(a) = b and d(b) = a, where a  b, then a and b are an amicable pair and each of a and b are called amicable numbers.

//		For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

//		Evaluate the sum of all the amicable numbers under 10000.
		Set <Integer> amicableNumberSet = new TreeSet<Integer>();
		int sum = 0;
		for(int i =1; i <= 10000; i ++)
		{
			sum = 0 ; 
		
		
	//	if(i==220)
	//	{	System.out.println("i==220" + Util.getDivisorsAsSet(i)); //[1, 2, 55, 4, 20, 5, 22, 110, 10, 11, 44]
	//	System.out.println(sumOfElementsInASet(Util.getDivisorsAsSet(i)));
	//	}	
			sum = sumOfElementsInASet(Util.getDivisorsAsSet(i));
			if(i == sumOfElementsInASet(Util.getDivisorsAsSet(sum)) && i != sum)
			{	System.out.println(i + " is amicable with, "+sum+" -- " +Util.getDivisorsAsSet(i));
				amicableNumberSet.add(i);
			amicableNumberSet.add(sum);
			}
		}
		
		System.out.println(amicableNumberSet);
		
		System.out.println("Sum of amicable elements is " + sumOfElementsInASet(amicableNumberSet));
		
	}
	
	public static int sumOfElementsInASet(Set<? extends Integer> set)
	{
		int sum = 0;
		
		
	Iterator<Integer> i =	(Iterator<Integer>) set.iterator();
		 while(i.hasNext())
		 {
			sum = sum + i.next(); 
			 
		 }
		 
		
		
		return sum;
		
	}

}
