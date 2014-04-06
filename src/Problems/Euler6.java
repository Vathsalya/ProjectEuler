package Problems;

public class Euler6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int difference = 0;
		int sumOfsquares =0;
		int squareofsum =0;
		final int RANGE = 100;
		sumOfsquares = getSumOfSquares(RANGE);
		squareofsum = getSquareOfSum(RANGE);
		difference = squareofsum -  sumOfsquares ;
		System.out.println("difference between the sum of the squares of the first one hundred natural numbers and the square of the sum\n "+difference);
	}

	private static int getSquareOfSum(int n) {
		// TODO Auto-generated method stub
		return (int) Math.pow((n*(n+1)/2), 2);
	}

	private static int getSumOfSquares(int n) {
		// TODO Auto-generated method stub
		return ((n*(n+1)*(2*n+1))/6);
	}
	
	

}
