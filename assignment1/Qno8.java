package flynaut.basic.assignment1;

import java.util.Scanner;

public class Qno8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int num1 = sc.nextInt();
		System.out.println("enter the second number");
		int num2 = sc.nextInt();
		
		int multiplication = num1 * num2; 
		System.out.println("multiplication is "+multiplication);
		sc.close();
	}

}
