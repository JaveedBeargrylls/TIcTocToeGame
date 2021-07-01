package com.bridgelabz.TicTacTocGame;

import java.util.Scanner;

// created the class name TicTacToeGame

public class TicTacToeGame {


		// Created the board and assigned the empty space UC - 1
	
	private static char[] gameBoard() {
		char[] board = new char[10];
		for (int i = 0; i < board.length; i++) {
			board[i] = ' ';
		}
		return board;
	}
	
	// Creating the letter X/O to play the Game UC - 2
	
	private static char playletter(Scanner inputletter) {
		
		System.out.println("Choose your Play 'X' or 'O' : ");
		
		return inputletter.next().toUpperCase().charAt(0);
	}
	
	// Creation of gameBorad and to Show it UC -3
	
	private static void showboard(char[] board) {
		System.out.println("\n\n\tGame Board");
		System.out.println("\t"+board[1] + " | " + board[2] + " | " + board[3]);
		System.out.println("\t"+"--" + "+" + "---" + "+" + "--");
		System.out.println("\t"+board[4] + " | " + board[5] + " | " + board[6]);
		System.out.println("\t"+"--" + "+" + "---" + "+" + "--");
		System.out.println("\t"+board[7] + " | " + board[8] + " | " + board[9]);
		
	}

		/* 	main 	*/
	
	public static void main(String[] args) {
		System.out.println("\tTicTacToe Game");
		char[] board = gameBoard();
		Scanner inputletter = new Scanner(System.in);
		char userplay = playletter(inputletter);
		char computerplay = (userplay == 'X') ? 'O' : 'X';
		
		// Printing the userplay and computer play to verify
		System.out.println("userplay = "+userplay);
		System.out.println("computerplay = "+computerplay);
		showboard(board);
	}
}

















