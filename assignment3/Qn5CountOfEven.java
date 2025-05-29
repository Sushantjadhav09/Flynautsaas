package flynaut.basic.assignment3;

public class Qn5CountOfEven {
	public static void main(String[] args) {
		int arr[] = { 4,5,7,2,5,1};
		int oddCount = 0;
		int evenCount = 0;
		
		for(int i = 0;i<arr.length;i++){
			if((arr[i]%2)==0) {
				evenCount ++;
				
			}else
				oddCount ++;
		}
		System.out.println("count of even is "+evenCount +"\ncount of odd is "+oddCount);
	}
	

}
