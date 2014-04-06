package Problems;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Euler13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = null;
		
		try {
			 s = new Scanner(new FileReader("13"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BigInteger sum = BigInteger.ZERO;
		while(s.hasNextBigInteger()){
			try{
			
					BigInteger b = s.nextBigInteger();// new BigInteger(s.next());
					System.out.println(""+b.toString());
					sum = sum.add(b);
				
				
			}catch(NumberFormatException e){}

		}
		String ss = sum.toString();
		for(int i = 0;i<10;i++){
			System.out.println(ss.charAt(i));
		}
		System.out.println(""+sum);
		
		
	}

}
