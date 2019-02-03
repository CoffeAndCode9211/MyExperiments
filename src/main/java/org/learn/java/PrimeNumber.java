package org.learn.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeNumber {

	// https://www.hackerearth.com/practice/basic-programming/complexity-analysis/time-and-space-complexity/practice-problems/algorithm/prime-ministers-number/

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String data = br.readLine();
		String[] range = data.split(" ");
		int from = Integer.parseInt(range[0]);
		int to = Integer.parseInt(range[1]);

		StringBuilder str = new StringBuilder();
		
		for(int i=from; i <= to; i++){
			if(isPrime(i) && isPrime(sumDigits(i))){
				str.append(i);
				str.append(" ");
			}
		}
		System.out.println(str.toString());
	}

	public static int sumDigits(int no) 
    { 
        return no == 0 ? 0 : no%10 + sumDigits(no/10) ; 
    } 
	
	public static boolean isPrime(int n) {
		if (n == 2 || n == 3) {
			return true;
		}
		double root = Math.sqrt(n);
		if (n % 2 == 0 || n % 3 == 0) { return false; }
		for (int i = 3; i <= root; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
