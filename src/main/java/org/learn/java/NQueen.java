package org.learn.java;

import java.util.Scanner;

public class NQueen {

	public static void main(String[] args) throws Exception {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		if (n == 2 || n ==  3) {
			System.out.println("Not possible");
			return;
		}

		int[][] board = new int[n][n];
		for (int p = 0; p < n; p++) {
			for (int q = 0; q < n; q++) {
				board[p][q] = 0;
			}
		}
		char space = '\n';
		StringBuilder str = new StringBuilder();
		if (getQueenPattern(board, 0, n)) {
			for (int p = 0; p < n; p++) {
				for (int q = 0; q < n; q++) {
					str.append(board[q][p]);
					str.append(" ");
				}
				str.append(space);
			}
		} else {
			str.append("Not possible");
		}
		System.out.print(str.toString());
	}

	public static boolean getQueenPattern(int board[][], int col, int n) {
		if (col >= n) { // all queens are places
			return true;
		}
		for (int i = 0; i < n; i++) {
			if (isPossible(board, i, col, n)) {
				board[i][col] = 1;
				if (getQueenPattern(board, col + 1, n)) {
					return true;
				} else {
					board[i][col] = 0;
				}
			}
		}

		return false;
	}

	public static boolean isPossible(int board[][], int row, int col, int n) {
		int i, j;

		for (i = 0; i < n; i++) {
			if (board[row][i] == 1) { // check for row
				return false;
			}
			if (board[i][col] == 1) { // check for column
				return false;
			}
		}

		for (i = 0; i < n; i++) {
			if (board[i][col] == 1) {
				return false;
			}
		}

		for (int p = 0; p < n; p++) {
			for (int q = 0; q < n; q++) {
				if (p == row && q == col) {
					continue;
				}
				if ((board[p][q] == 1)
						&& ((p + q == row + col) || (p - q == row - col))) {
					return false;
				}
			}
		}
		return true;

	}

}
