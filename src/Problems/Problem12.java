package Problems;

public class Problem12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int n = 1;
		int number=4;
		while(count<=500){
			
			number = (n*(n+1))/2;
			if(!isPrime(number)){
				for(int i=0;i<n;i++){
					if(number%2==0){
						number = number/2;
						count++;
					}

			}
			n++;
						}
		}
		System.out.print(number);
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
