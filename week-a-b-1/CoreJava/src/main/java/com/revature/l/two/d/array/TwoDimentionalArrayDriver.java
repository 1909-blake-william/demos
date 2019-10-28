package com.revature.l.two.d.array;

import java.util.Arrays;

public class TwoDimentionalArrayDriver {
	public static void main(String[] args) {
		char[][] board = new char[3][3];
		
		for(char[] row: board) {
			Arrays.fill(row, '~');
		}
		
		board[1][1] = 'X';
		board[1][2] = 'O';
		board[2][0] = 'X';
		board[0][2] = 'O';
		
		printBoard(board);
	}
	
	private static void printBoard(char[][] board) {
		for(char[] row: board) {
			System.out.println(Arrays.toString(row));
		}
	}
}
