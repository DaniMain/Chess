package main;

import java.util.HashSet;
import java.util.Set;

import board.ChessBoard;
import board.Square;
import pieces.Piece;

public class Match {

	private ChessBoard board;
	private boolean whiteTurn;
	private boolean ended;

	public Match(){
		this.board = new ChessBoard();
		this.whiteTurn = true;
		this.ended = false;
	}

	public boolean play(String move){
		if (move.equals("end")){
			this.setEnded();
			return true;
		}
		if (!checkValid(move)){
			return false;
		}
		else{
			return true;//to-do
		}
//		else{
//			if (this.isWhiteTurn())
//				return this.playWhite(move);
//			else
//				return this.playBlack(move);
//		}
	}

	private boolean checkValid(String move) {
		if (this.isWhiteTurn()){
			return this.checkMove(move, this.getBoard().getWhitePieces());
		}
		else{
			return this.checkMove(move, this.getBoard().getBlackPieces());	
		}
	}

	private boolean checkMove(String move, Set<Piece> pieces) {
		boolean check = false;
		move.toUpperCase();
		String pieceSym;
		String coordinate;
		String[] arrMove = move.split("X");
		/* if split for "X" and is equal to 1 it's a move */
		if (arrMove.length==1){
			pieceSym = move.substring(0,1);
			coordinate = move.substring(move.length()-2,move.length());
		}
		/* therefore it's a take */
		else{
			pieceSym = arrMove[0].substring(0,1);
			coordinate = arrMove[1];
		}
		if (pieceSym.equals("")){
			pieceSym = "P";
		}
		/* check if it's possible retrieve in the square with that coordinate*/
		Set<Piece> candidatePieces = new HashSet<>();
		for (Piece p: pieces){
			if (p.getSym().equals(pieceSym)){
				candidatePieces.add(p);
			}
		}
		if (candidatePieces.size()==0){// there are no pieces, so invalid move
			return false;
		}
		else{// check in all candidate pieces if this move is possible 
			for (Piece p: candidatePieces){
				check = checkNewPosition(p.getMoveTo(), coordinate) || 
						checkNewPosition(p.getTakeTo(), coordinate);
				if (check){
					break;
				}
			}
		}
		return check;
//		else if (candidatePieces.size()==1){// there's one piece, so check in this
//			return checkNewPosition(candidatePieces.)
//		}
//		else if (candidatePieces.size()==2){// two pieces, select who store in that coordinate
//			
//		}
//		else {// it's sure a pawn
//			
//		}
	}

	private boolean checkNewPosition(Set<Square> possibleSquare, String coordinate) {
		for (@SuppressWarnings("unused") Square s: possibleSquare){
			//to-do
		}
		return false;
	}

//	private boolean playWhite(String move) {
//		this.setWhiteTime(false);
//		return move.equals("d4");
//	}
//
//	private boolean playBlack(String move) {
//		this.setWhiteTime(true);
//		return move.equals("d4");
//	}

	public ChessBoard getBoard() {
		return board;
	}

	public void setBoard(ChessBoard board) {
		this.board = board;
	}

	public boolean isWhiteTurn() {
		return whiteTurn;
	}

	public void setWhiteTime(boolean whiteTime) {
		this.whiteTurn = whiteTime;
	}

	public boolean isEnded() {
		return ended;
	}

	public void setEnded() {
		this.ended = true;
	}

}
