package Problems;

public class Euler7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MAX = 10001;
		int count = 0;
		int i = 2;
		while(count<=MAX){
			//i = 2;
			
			if(isPrime(i)){
				count++;
				if(count == MAX){
					System.out.println("MAX "+i);
					break;
				}
			}
			//System.out.println("count "+count);
			i++;
		}
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
