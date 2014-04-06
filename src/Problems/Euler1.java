package Problems;

public class Euler1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_RANGE = 1000;
		int sum = 0;
		sum = getSumOfMultiples(MAX_RANGE);
		System.out.println(" Sum of all the multiples of 3 or 5 below 1000 is "+sum);
	}
	public static int getSumOfMultiples(int range){
		int sum = 0;
		for(int i=0;i<1000;i++){
			if(i%3==0||i%5==0){
				sum = sum + i;
			}
		}
		return sum;
	}

}
