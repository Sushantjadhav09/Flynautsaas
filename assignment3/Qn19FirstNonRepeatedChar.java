package flynaut.basic.assignment3;

public class Qn19FirstNonRepeatedChar {
	public static void main(String[] args) {
		String str = "jadhavj";
		int len = str.length();		
		for(int i=0;i<len;i++) {
			boolean found = false;
			for(int j=0;j<len;j++) {
				if(i != j && str.charAt(i) == str.charAt(j)) {
					found = true;
					break;
				}
			}
			if(!found) {
				System.out.println(str.charAt(i));
				break;
			}
		}
	}

}
