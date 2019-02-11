package org.learn.java;


public class TestClass {

	
	
	public static void main(String[] args) {
		long[] A = new long[]{ 6,12, 7,8,10,15 };
		int n = A.length;
		long sum = solve(A, n);
		System.out.println(sum);
	}
	
	static long solve(long[] A, int N){
		long minDiff = 0;
		long minSum = 0;
		int index = -1;
		for(int i=0; i< N-1; i++){
			long diff = Math.abs(A[i] - A[i+1]);
			if(diff > minDiff){
				minDiff = diff;
				index = i+1;
			}
			minSum += diff;
		}
		if(index == 0){
			long d = A[index] - A[index+1];
			if(d < 0){
				d = d * -1;
			}
			minSum = minSum - d; 
		}else if(index == (N - 1)){
			long d = A[index-1] - A[index];
			if(d < 0){
				d = d * -1;
			}
			minSum = minSum - d; 
		}else{
			
			long left = A[index -1] - A[index];
			if(left < 0){
				left = left * -1;
			}
			
			long right = A[index] - A[index+1];
			if(right < 0){
				right = right * -1;
			}
			
			long ref = A[index -1] - A[index + 1];
			if(ref < 0){
				ref = ref * -1;
			}
			
			minSum = minSum - (left + right) + ref;
			
		}
		
		
		return minSum;
		
	}
}
