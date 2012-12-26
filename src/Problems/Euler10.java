package Problems;

public class Euler10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MAX_RANGE=200;//0000;
		int sum=0,num=0;
		int i = 2,count=0;
		
	/*	for(int i = 0;i<MAX_RANGE;i++){
			if(isPrime(i)){
				sum = sum + i;
				System.out.println(i);
			}
		}
		*/
		while(count<=MAX_RANGE){
			
			//num =  getFibonacci(i);
			if(isPrime(i)){
				System.out.println("i "+i);
				sum = sum + i;
				count++;
				if(count == MAX_RANGE){
					System.out.println("MAX "+sum);
					break;
				}

			}
			i++;
		}
		
		System.out.println("Sum of primes :"+sum);

	}
	private static boolean isPrime(int n) { //COPIED
		// TODO Auto-generated method stub
		 if (n <= 1) {
             return false;
         }
         if (n == 2) {
             return true;
         }
         for (int i = 2; i <= Math.sqrt(n) + 1; i++) {
             if (n % i == 0) {
            	   return false;
             }
         }
         return true;
	}
}
