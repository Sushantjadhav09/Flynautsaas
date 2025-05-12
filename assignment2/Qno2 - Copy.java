package flynaut.basic.assignment2;

import java.util.Scanner;

public class Qno2 {
	public static void primeNO() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		int num = sc.nextInt();
		int count = 0;
		for(int i = 2;i<=num;i++) {
		if(num % i == 0) {
			count ++;
		 }
		}
		if(count <= 2) {
			System.out.println(num+" is prime number");
		}else
			System.out.println(num+" is not prime number");
		
		sc.close();
	}
	public static void main(String[] args) {
	  Qno2.primeNO();
	}
}
