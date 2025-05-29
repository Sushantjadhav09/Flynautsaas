package flynaut.basic.assignment3;

public class Qn8SearchArray {
	public static void main(String[] args) {
		int arr[] = {3,4,5,6,8};
		int target = 4;
		boolean flag = false;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == target) {
				flag = true;
				break;
			}
		}
		if(flag == true) {
			System.out.println("got the element");
		}else {
			System.out.println("element not found");
		}
	}

}
