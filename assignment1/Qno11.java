package flynaut.basic.assignment1;

import java.util.Scanner;

public class Qno11 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the radius");
			double radius = sc.nextDouble();
			
			double areOfcircle =  3.14 * radius * radius;
			double circumference = 2 * 3.14 * radius;
			System.out.println("Are of circle is "+areOfcircle);
			System.out.println("Are of Circumference is "+circumference);

			sc.close();
			
			
			
			
	}

}
