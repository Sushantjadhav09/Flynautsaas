package flynaut.basic.assignment3;

public class Qn3reverseArray {
	public static void main(String[] args) {
		int arr[] = {3,5,7,2};
		
		int left = 0;
		int right = arr.length-1;
		while(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left ++;
			right --;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}

}
