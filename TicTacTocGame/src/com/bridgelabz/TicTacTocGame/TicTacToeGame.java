package com.bridgelabz.TicTacTocGame;

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

	// called from main 
	
	public static void main(String[] args) {
		System.out.println("\tTicTacToe Game");
		char[] board = gameBoard();
	}
}