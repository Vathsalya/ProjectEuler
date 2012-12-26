package Problems;

import java.math.BigInteger;

public class Euler20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = ""+getFactorial(100);
		//System.out.println(getFactorial(100));
		int sum = 0;
		for(int i = 0;i<s.length();i++)
			sum = sum + Character.getNumericValue(s.charAt(i));
		System.out.println("SUM "+sum);
	}
	
	public static BigInteger getFactorial(int n){
		if (n == 1) {
            return (BigInteger.valueOf(n));
        }else{
         	return BigInteger.valueOf(n).multiply(getFactorial(n-1));
         }
	}

}
