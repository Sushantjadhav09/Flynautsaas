package flynaut.basic.assignment3;

public class Qn12findVowelsConsonants {
	public static void main(String[] args) {
		String str = "chris bumsted";
		str.toLowerCase();
		
		int vcount =0, ccount=0;
		
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vcount ++;
			}else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				ccount++;
			}
			
		}
		System.out.println("count of vowels is "+vcount);
		System.out.println("count of constants is "+ccount);
		
	
 	}
}
