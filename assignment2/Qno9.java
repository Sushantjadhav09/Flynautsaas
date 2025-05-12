package flynaut.basic.assignment2;

public class Qno9 {
	public static void main(String[] args) {
		int rev = 0,temp,rem;
		int num = 121;
		temp = num;
		while(temp != 0) {
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
		}
		if(num == rev) {
			System.out.println(num+" is palindrome");
		}else
			System.out.println(num+" is not palindrome");
	}

}
