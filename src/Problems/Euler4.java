package Problems;

public class Euler4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[999*100];
		int count = 0;
		for(int i = 100;i<999;i++){
			for(int j = 100;j<999;j++){
				int k = i * j;
				if(checkPalindrome(k)){
					//System.out.println(k);
					arr[count] = k;
					count++;
				}
			}
		}
		int max = getMax(arr);
		System.out.println(max);
	}
	public static int getMax(int[] arr){ //Bubble sort
		for(int x=0; x<arr.length; x++){
			for(int i = 0;i<arr.length-1;i++){
				int k = i;
				if(arr[i]>arr[i+1]){
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}

			}
		}
		return arr[arr.length-1];
	}
	public static boolean checkPalindrome(int k){ //Palindrome check
		String s = ""+k;
		int low = 0;
		int high = s.length()-1;
		boolean isPalindrome = false;
		while(low<high){
			if(s.charAt(low)!=s.charAt(high)){
				isPalindrome = false;
				break;
			}else
				isPalindrome = true;

			low++;
			high--;
		}
		return isPalindrome;
	}

}
