package flynaut.basic.assignment1;

import java.util.Scanner;

public class Qno3 {
	public static void main(String[] args) {
		
		String userid = "jake456";
		String name = "Jake";
		int age = 34;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  user id");
		String inputuserId = sc.nextLine();
		if(inputuserId.equals(userid)) {
			System.out.println("name " +name +"\nage "+age);
		}else
			System.out.println("Invalid user id");
		
		sc.close();
	}

}
