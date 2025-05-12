package flynaut.basic.assignment2;

import java.util.Scanner;

public class Qno10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check ");
		int num = sc.nextInt();
		int rev = 0,temp;
		temp = num;
		while(temp !=0) {
			int rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
		}
		if(num == rev) {
			System.out.println(num+" is palindrome");
		}else
			System.out.println(num+" is not palindrome");
		sc.close();
		
	}

}
