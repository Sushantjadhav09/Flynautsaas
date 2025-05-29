package flynaut.basic.assignment3;

public class Qn4smallestNoInarray {
	public static void main(String[] args) {
		
		int arr[] = {5,3,8,2,1};
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}
	
}
