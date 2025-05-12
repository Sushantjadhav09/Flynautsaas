package flynaut.basic.assignment2;

import java.util.Scanner;

public class Qno1 {
	public static void checkNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		int num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println(num+" is even number");
		}else
			System.out.println(num+" is odd number");
		sc.close();
	}
	public static void main(String[] args) {
		Qno1.checkNo();
		
	}

}
