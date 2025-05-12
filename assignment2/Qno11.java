package flynaut.basic.assignment2;

public class Qno11 {
	public static void main(String[] args) {
		int num = 153;
		int res = 0,temp;
		temp = num;
		while(temp!=0) {
			int rem = temp%10;
			res = res+rem*rem*rem;
			temp =  temp/10;
		}
		if(num == res) {
			System.out.println(num+" is armstrong");
		}else
			System.out.println(num+" is not armstrong");
		
	}

}
