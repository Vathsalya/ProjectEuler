package com.project.euler.net;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Problem23 {
	static Set<Integer> abundantNumberSet = getAbundantNumbersSetLessThan(28123);

	static Set<Integer> SumOfAbundantNumbersSet = new HashSet<Integer>();
	static int maxNumberProcessedTillNow =0;
	public static void main(String args[])
	{
		
	
		Iterator<Integer> iterObj = abundantNumberSet.iterator();
		long sum = 0;
	for(int i = 0 ; i <=28123;i++ )
	{
		
		if(!checkIfNumberIsSumOfTwoAbundantNumbers(i))
			sum = sum + i ; 
		System.out.println("working with i = " + i);
		
		if(i==20000)
			System.out.println();
		
	}
	
		
		System.out.println(sum + " is the sum of all numbers which cannot be expressed as a sum of abundant numbers"); //234556

	}
	
	boolean isAbundantNumber(int N ){
		
	return false;
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
	
	public static Set<Integer> getAbundantNumbersSetLessThan(Integer number){
		
		TreeSet<Integer> abundantNumberSet= new TreeSet<Integer>();
		int sum = 0;
		for(int i =1; i <= number; i ++)
		{
			sum = 0 ; 


			sum = sumOfElementsInASet(Util.getDivisorsAsSet(i));
			if(i < sum)
			{	System.out.println(i + " is abundant with, "+sum+" -- " +Util.getDivisorsAsSet(i));
abundantNumberSet.add(i);
			}
		}
		return abundantNumberSet;
	}
	
	
	static boolean checkIfNumberIsSumOfTwoAbundantNumbers(int N)
	{

		Iterator<Integer> iterObj =abundantNumberSet.iterator();
		int tempAbundantNum=12;
		
		while(iterObj.hasNext())
		{
			tempAbundantNum= iterObj.next();
			if(tempAbundantNum<N )
			{
				if (abundantNumberSet.contains(N-tempAbundantNum)){
					System.out.println("Numbers are  " + N + " and " + (N-tempAbundantNum));
					return true;
				}
					
			}
			
		}
		
		return false;
	}
	
	
/*
 * Purpose is to check for any number of abundant numbers
 * 
 * 
 */
	
	static boolean checkIfNumberIsSumOfAbundantNumbers(int N) 
	{
		
		if(SumOfAbundantNumbersSet.contains(N))
			return true; //memoizing
		if(N<= maxNumberProcessedTillNow)
			return false; //memoizing , already processed values that are less than max processed and which are not part of sum of abundant numbers set.
		else
			maxNumberProcessedTillNow = N;
		
		
		
		
		
		Iterator<Integer> iterObj =abundantNumberSet.iterator();
		int tempAbundantNum=12;
		
		while(iterObj.hasNext())
		{
			tempAbundantNum= iterObj.next();
			if(tempAbundantNum>N )
				break;
			if (N-tempAbundantNum ==0 || checkIfNumberIsSumOfAbundantNumbers(N-tempAbundantNum) )
			{	SumOfAbundantNumbersSet.add(N);
				return true;
			
			}
		}
		
		
		return false;
		
	}
}
