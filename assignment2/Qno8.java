package flynaut.basic.assignment2;

public class Qno8 {
	public static int  reverse(int num) {
		int rev=0;
		while(num != 0) {
			int rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
		
		return rev;
	}
	public static void main(String[] args) {
		int res = Qno8.reverse(1234);
		System.out.println(res);
	}

}
