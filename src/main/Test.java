package main;

import board.ChessBoard;
import board.Square;
import pieces.Pawn;
import pieces.Piece;
import print.Print;

public class Test {
	
	public static void main(String[] args) {
//		proviamolacasella();
		proviamolaprintdellascacchiera();
	}
	
	private static void proviamolacasella(){
		ChessBoard board = new ChessBoard();
		Print.println(board.getPiece("a1"));
		Piece pawn = new Pawn("pawn", "p", "a1", true);
		Square a1 = new Square("a1");
		a1.setPieceIn(pawn);
		board.setSquare("a1", a1);
		Print.println(board.getPiece("a1"));
	}
	
	private static void proviamolaprintdellascacchiera(){
		ChessBoard board = new ChessBoard();
		board.printBoard();
	}
}
