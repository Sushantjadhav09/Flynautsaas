package flynaut.basic.assignment1;

import java.util.Scanner;

public class Qno5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first no");
		int num1 = sc.nextInt();
		System.out.println("Enter the second no");
		int num2 = sc.nextInt();
		System.out.println("Enter the third no");
		int num3 = sc.nextInt();
		int largest;
		if(num1>=num2 && num1>= num3) {
			largest = num1;
		}else if (num2>=num1 && num2>= num3) {
			largest = num2;
		}else 
			largest = num3;
		System.out.println("largest no is "+largest);
		
		sc.close();
		
	}

}
