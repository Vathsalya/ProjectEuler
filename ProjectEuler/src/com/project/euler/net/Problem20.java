package com.project.euler.net;

import java.math.BigInteger;
import java.util.ArrayList;

public class Problem20 {

	/**
	 * @param args
	 */
	
	public static ArrayList<BigInteger> listOfFactorials = new ArrayList<BigInteger>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//memoize
		
		System.out.println("Sum of all numbers in 100! = " + Util.AddNumbersInAString(factorial(100).toString()));
		
	}

	public static BigInteger factorial(int number)
	{
		if(number == 0 || number ==1 )
		{
			return new BigInteger("1"); 
			
		}
		if(number < listOfFactorials.size() && listOfFactorials.get(number)!=null)
		{
			
			return listOfFactorials.get(number);
		}
		else
		{
			listOfFactorials.add( new BigInteger(""+number).multiply(factorial(number-1)));
			return listOfFactorials.get(number-2);
		}
		
	}
}
