package flynaut.basic.assignment3;

public class Qn2sumOfarray {
	public static void main(String[] args) {
		int arr[] = {4,5,7,2};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		System.out.println(sum);
	}

}
