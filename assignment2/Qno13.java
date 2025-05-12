package flynaut.basic.assignment2;

public class Qno13 {
	public static boolean isArmstrong(int num) {
		int res = 0,rem,temp;
		temp = num;
		while(temp!=0) {
			rem = temp%10;
			res = res + rem*rem*rem;
			temp = temp/10;
		}
		if(num == res) {
			return true;
		}else
			return false;
	}
	public static void main(String[] args) {
		for(int i = 0;i<1000;i++) {
			if(isArmstrong(i)) {
				System.out.println(i);
			}
		}
	}

}
