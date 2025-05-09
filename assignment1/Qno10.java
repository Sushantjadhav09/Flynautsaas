package flynaut.basic.assignment1;

import java.util.Scanner;

public class Qno10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the temprature fahreneit");
		double fahreneit = sc.nextDouble();
		
		double celsius = (fahreneit - 32)*5/9;
		System.out.println("Celsius is "+celsius);
		sc.close();
	}

}
