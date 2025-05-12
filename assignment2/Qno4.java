package flynaut.basic.assignment2;

public class Qno4 {
	public static void jumpState() {
		for(int i = 1;i<=10;i++) {
			if(i == 5 || i == 6) {
				continue;
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Qno4.jumpState();
	}

}
