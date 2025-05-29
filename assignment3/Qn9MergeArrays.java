package flynaut.basic.assignment3;

public class Qn9MergeArrays {
	public static void main(String[] args) {
		int arr1[]= {2,4,5,6};
		int arr2[]= {7,8,9};
		int len = arr1.length+arr2.length;
		int arr[] = new int[len];
		for(int i=0;i<arr1.length;i++) {
			arr[i]= arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			arr[arr1.length +i]=arr2[i];
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}

}
