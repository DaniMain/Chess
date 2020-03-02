package main;

import board.ChessBoard;
import pieces.Pawn;
import pieces.Piece;
import print.Print;

public class Test {

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static void main(String[] args) {
		proviamolacasella();
		proviamolaprintdellascacchiera();
//		System.out.println(ANSI_RED + "ERROR MESSAGE IN RED" + ANSI_RESET);
	}

	private static void proviamolacasella(){
		ChessBoard board = new ChessBoard();
		Print.println(board.getPiece("b4"));
		Piece pawn = new Pawn("pawn", "p", true, "b4");
		board.setSquare("b4", pawn);
		Print.println(board.getPiece("b4"));
	}

	private static void proviamolaprintdellascacchiera(){
		ChessBoard board = new ChessBoard();
		board.printBoard();
	}
}
