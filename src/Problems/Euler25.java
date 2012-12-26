package Problems;

import java.math.BigInteger;

public class Euler25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int NUM = 1000;
		int fiboLength = 0;
		int i = 1;
		while(fiboLength<=1000){
			String s = ""+getFibonacci(i);
			fiboLength = s.length();
			//System.out.println(i+" "+s+" "+fiboLength);
			if(fiboLength==1000)
			{
				break;
			}
			i++;
		}
		System.out.println(fiboLength);
	}
	public static BigInteger getFibonacci(int n){
		if(n <= 1)
			return (BigInteger.valueOf(n));
		else
			return (getFibonacci(n-1).add(getFibonacci(n-2)));
	}

}
