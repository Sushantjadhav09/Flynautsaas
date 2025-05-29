package flynaut.basic.assignment3;

public class Qn17RemoveSpaces {
	public static void main(String[] args) {
		String str = "th    i s i  s be  tte  r";
		System.out.println(str);
		str =str.replaceAll("\\s", "");
		System.out.println(str);
	}
}
