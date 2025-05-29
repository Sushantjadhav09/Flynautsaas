package flynaut.basic.assignment3;

public class Qn1largestNo {
	public static void main(String[] args) {
		int arr[] = {5,3,8,2,1};
		int max = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
