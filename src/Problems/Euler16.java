package Problems;

import java.math.BigInteger;

public class Euler16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = ""+BigInteger.valueOf(2).pow(1000);
		//System.out.println(BigInteger.valueOf((long) Math.pow(2, 1000)));
		int sum = 0;
		for(int i = 0;i<s.length();i++)
		{
			sum = sum + Character.getNumericValue(s.charAt(i));
		}
		System.out.println("s "+s+" SUM "+sum);
	}

}
