package flynaut.basic.assignment3;

public class Qn10RemoveDuplicate {
	public static void main(String[] args) {
		
		  int a[] = { 1, 2, 3, 1, 4, 2, 1, 5 };
	        int n = a.length;
	        int m = 0;
	        for (int i = 0; i < n; i++) {
	            m = Math.max(m, a[i]);
	        }
	        int[] f = new int[m + 1];
	        for (int i = 0; i < n; i++) 
	        {
	            f[a[i]]++;
	        }
	        for (int i = 0; i < m + 1; i++) 
	        {
	            if (f[i] > 0) {
	                System.out.print(i + " ");
	            }
	        }
	    
		
	}

}
