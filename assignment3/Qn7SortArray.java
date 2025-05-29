package flynaut.basic.assignment3;

public class Qn7SortArray {
	public static void main(String[] args) {
		int arr[] = {8,5,6,3,9};
		
		for(int i=0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int a: arr) {
			System.out.print(a);
		}
	}

}
