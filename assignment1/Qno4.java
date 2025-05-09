package flynaut.basic.assignment1;

import java.util.Scanner;

public class Qno4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		age = age+1;
		System.out.println("updated age is "+age);
		sc.close();
	}
}
