package flynaut.basic.assignment3;

public class Qn6CopyArray {
	public static void main(String[] args) {
		int arr[] = {4,5,7,8};
		
		int arr1[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr1[i] = arr[i];
			System.out.print(arr1[i]);
		}
		
	}

}
