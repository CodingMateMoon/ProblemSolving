import java.util.Arrays;

class Sort_Array {
    public int solution(int[] A) {
        // write your code in Java SE 8
    	Arrays.sort(A);
		
		int count = 0;
		int tempCount = 0;
		for (int i = 0; i < A.length; i++) {
			
			if (i == 0) {
				tempCount = 1;
				continue;
			}
			
			if (A[i -1] == A[i]) {
				tempCount++;
			} else {
				if (A[i - 1] + 1 == A[i]) {
					count += tempCount;
				} 
				tempCount = 1;	
			}
		}
		
		return count;
    }
}