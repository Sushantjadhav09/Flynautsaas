package flynaut.basic.assignment3;

public class Qn14CheckPalindrome {
	public static void main(String[] args) {
		String str = "nayan";
		boolean flag = true;
		str.toLowerCase();
		int left = 0;
		int right = str.length()-1;
		while(left<right) {
			if(str.charAt(left) != str.charAt(right)) {
				flag = false;
			}
			left++;
			right --;
		}
		if(flag == true) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}

}
