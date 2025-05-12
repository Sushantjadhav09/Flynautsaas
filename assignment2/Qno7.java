package flynaut.basic.assignment2;

import java.util.Scanner;

public class Qno7 {
	
	public static void prntTable() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num+" x "+i+" = "+num*i);
		}
		sc.close();
	}
	public static void main(String[] args) {
		Qno7.prntTable();
	}
}
