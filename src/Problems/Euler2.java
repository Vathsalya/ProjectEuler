package Problems;

public class Euler2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_RANGE = 4000000;
		int num=0,sum=0;
	
		int i =1;
		while(num<MAX_RANGE){
			num =  getFibonacci(i);
			if(num%2==0)
				sum = sum + num;
			i++;
		}
			System.out.println("Sum of the even-valued terms "+sum);
		
	}
	public static int getFibonacci(int n){
		if(n <= 1)
			return n;
		else
			return(getFibonacci(n-1)+getFibonacci(n-2));
	}
	

}
