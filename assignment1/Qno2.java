package flynaut.basic.assignment1;

import java.util.Scanner;

public class Qno2 {
	public  void dynmcGreeting() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name ");
		 String name = sc.next();
		System.out.println("Enter the age");
		int age = sc.nextInt();
		System.out.println("Your name is "+ name +" and age is "+ age);
		sc.close();
	}

	public static void main(String[] args) {
		Qno2 obj = new Qno2();
	    obj.dynmcGreeting();
	    
 } 
}
