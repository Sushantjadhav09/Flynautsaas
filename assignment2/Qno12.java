package flynaut.basic.assignment2;

import java.util.Scanner;

public class Qno12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no to check");
		int num = sc.nextInt();
		int res = 0,temp,rem;
		temp = num;
		while(temp!=0) {
			rem = temp%10;
			res = res+rem*rem*rem;
			temp = temp/10;
		}
		if(num == res) {
			System.out.println(num+" is armstrong");
		}else
			System.out.println(num+" is not armstrong");
	}

}
