package org.learn.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VowelRecognition {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder str = new StringBuilder();
		while(n-- > 0){
			
			char[] ch = br.readLine().toCharArray();
			long l = ch.length;
			long count = 0;
			int i = 0;
			for(char c : ch) {
                if(checkVowel(c)){
                	count += (i + 1) * (l - i);
                }
                i++;
            }
			str.append(count).append("\n");
			
		}
		System.out.println(str.toString());
	}
	
	public static boolean checkVowel(char c){
		 return c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o'
	                || c == 'A' || c == 'I' || c == 'U' || c == 'E' || c == 'O';
	}
}
