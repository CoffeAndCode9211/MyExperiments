package org.learn.java;

import java.util.Arrays;

public class ClosestSumInArray {

	/*
	 * Given 2 Array, find pair which shows closest to a given number
	 */
	public static void main(String[] args) {

		int x[] = new int[] { 1, 5, 6, 7, 9, 11, 4, 14 };
		int y[] = new int[] { 7, 6, 8, 4, 3, 2, 11, 5 };
		int no = 11;
		Arrays.sort(x);
		Arrays.sort(y);

		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		int[] index = closestSumPair(x, y, no);
		System.out.println(x[index[0]] + "," + y[index[1]]);

	}

	public static int[] closestSumPair(int[] x, int[] y, int target) {
		int[] cloPair = { x[0], y[0] };
		int i = 0;
		int j = y.length - 1;
		int smallestDiff = Math.abs((x[0] + y[0]) - target);

		while (i < x.length && j >= 0) {

			int x1 = x[i];
			int y1 = y[j];
			int currDiff = x1 + y1 - target;
			if (Math.abs(currDiff) < smallestDiff) {
				smallestDiff = currDiff;
				cloPair[0] = i;
				cloPair[1] = j;
			}

			if (currDiff == 0) {
				return cloPair;
			} else if (currDiff < 0) {
				i += 1;
			} else {
				j -= 1;
			}
		}
		return cloPair;
	}

}
