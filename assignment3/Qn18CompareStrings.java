package flynaut.basic.assignment3;

public class Qn18CompareStrings {
	public static void main(String[] args) {
		String str = "CBUM";
		String str1 = new String("CBUM");
		
		if(str.equals(str1)) {
			System.out.println("equal");
		}else 
			System.out.println("not equal");
	}

}
