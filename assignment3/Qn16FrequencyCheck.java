package flynaut.basic.assignment3;

public class Qn16FrequencyCheck {
	public static void main(String[] args) {
		String str = "sushant";
		char ch = 's';
		int count = 0;
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("frequency of character is "+count);
	}

}
