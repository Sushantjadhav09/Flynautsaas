package flynaut.basic.assignment3;

public class Qn13ReverseStr {
	public static void main(String[] args) {
		String str = "Sushant";
		char ch[] = str.toLowerCase().toCharArray();
		int left = 0;
		int right = str.length()-1;
		while(left<right) {
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			left ++;
			right --;
		}
		for(char c : ch) {
			System.out.print(c);
		}
	}
}
