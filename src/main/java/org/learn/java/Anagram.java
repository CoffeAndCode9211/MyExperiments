package org.learn.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Anagram {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		for (int i = 0; i < testcase; i++) {
			String str1 = br.readLine(); 
			String str2 = br.readLine();
			int[] arr1 = new int[26];
			int[] arr2 = new int[26];
			int ans = 0;
			int j;
			for (j = 0; j < str1.length(); j++) {
				arr1[str1.charAt(j) - 'a']++;
			}
			j=0;
			for (j = 0; j < str2.length(); j++) {
				arr2[str2.charAt(j) - 'a']++;
			}
			j=0;
			for (j = 0; j < 26; j++) {
				ans +=  Math.abs(arr1[j] - arr2[j]);
			}

			System.out.println(ans);
		}

	}
}
