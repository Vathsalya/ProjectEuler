package com.project.euler.net;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Util {
	public static boolean isPrime(long  Number)
	{
		if(Number==2||Number==3)
			return true;
		
		
		
		for(double i=2; i<= Number/2;i++)
		{
			if(Number%i==0)
				return false;
			
		}
		return true;
		
	}
	
	public static long NthPrime(long  Number)
	{
		int countPrime =0;
				for(long i = 2; ;i++)
				{
					if(Util.isPrime(i))
						countPrime++;
					if(countPrime ==Number)
						return i;
					
				}
				
		
	}
	

	public int Max(Comparable varOne, Comparable varTwo)
	{
				if( varOne.compareTo(varTwo)>0)
			{
				return +1;
			}
			else return -1 ;
			
		
		
		
		
	}
	 public static long sumOfFirstNPositiveNumbers(long n)
	 {
		 return (n*(n+1)/2);
		 
	 }
	 
	 public static int AddNumbersInAString(String S)
	 {
	 	System.out.println("Length of String: " + S.length());
	 	int temp = 0; 
	 	for(int i=0; i < S.length(); i++)
	 	{
	 		temp += Integer.parseInt("" + S.charAt(i));
	 	}
	 	return temp;
	 }
	
	
}
