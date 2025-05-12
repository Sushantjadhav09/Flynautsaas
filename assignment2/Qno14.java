package flynaut.basic.assignment2;

public class Qno14 {
	public static boolean isPalindrome(int num) {
		int rev = 0,rem,temp;
		temp = num;
		while(temp != 0) {
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
		}
		if(num == rev) {
			return true;
		}else
		   return false;
	}
	public static void main(String[] args) {
//		boolean result = Qno14.isPalindrome(22);
//		System.out.println(result);
		for(int i=0;i<100;i++) {
			if(isPalindrome(i)) {
				System.out.println(i);
			}
		}
	}

}
