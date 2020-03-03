package pieces;

import java.util.HashSet;
import java.util.Set;
import board.Square;
import main.Match;

public class Pawn extends Piece {
	
	public Pawn(String name, String sym, boolean isWhite, String coordinate) {
		super(name, sym, isWhite, coordinate);
	}

	@Override
	void searchToMove(Match m) {
		Set<Square> toMove = new HashSet<>();
		boolean stopSearching = false;
		/* if white */
		if (this.isWhite()){
			/* search next pass is possible */
			String newCoordinate = this.makeCoordinate(this.getRowInt()+1, this.getColumnInt());
			try{ // this because if it's possible retrieve a square with this coordinate
				Square square = m.getBoard().getSquare(newCoordinate);
				if (!square.hasPiece()){
					toMove.add(square);
				}
				else{
					stopSearching = true;
				}
			}
			catch(Exception e){}
			/* if not moved search second pass is possible */
			if (this.getRowInt()==2 && !stopSearching){
				newCoordinate = this.makeCoordinate(this.getRowInt()+2, this.getColumnInt());
				try{
					Square square = m.getBoard().getSquare(newCoordinate);
					if (!square.hasPiece()){
						toMove.add(square);
					}
				}
				catch(Exception e){}
			}
		}
		/* if black */
		else{
			/* search next pass is possible */
			String newCoordinate = this.makeCoordinate(this.getRowInt()-1, this.getColumnInt());
			try{ // this because if it's possible retrieve a square with this coordinate
				Square square = m.getBoard().getSquare(newCoordinate);
				if (!square.hasPiece()){
					toMove.add(square);
				}
				else{
					stopSearching = true;
				}
			}
			catch(Exception e){}
			/* if not moved search second pass is possible */
			if (this.getRowInt()==7 && !stopSearching){
				newCoordinate = this.makeCoordinate(this.getRowInt()-2, this.getColumnInt());
				try{
					Square square = m.getBoard().getSquare(newCoordinate);
					if (!square.hasPiece()){
						toMove.add(square);
					}
				}
				catch(Exception e){}
			}		
		}
		this.setMoveTo(toMove);
		searchToTakePawn(m);
	}

	private void searchToTakePawn(Match m) {
		Set<Square> toTake = new HashSet<>();
		/* if white */
		if (this.isWhite()){
			/* diagonal left */
			String DLcoordinate = this.makeCoordinate(this.getRowInt()+1, this.getColumnInt()-1);
			try{
				Square dl = m.getBoard().getSquare(DLcoordinate);
				if (!dl.hasPiece()){
					if (dl.getPieceIn().isWhite()!=this.isWhite()){
						toTake.add(dl);
					}
				}
			}
			catch(Exception e){}
			/* diagonal right */
			String DRcoordinate = this.makeCoordinate(this.getRowInt()+1, this.getColumnInt()+1);
			try{
				Square dr = m.getBoard().getSquare(DRcoordinate);
				if (!dr.hasPiece()){
					if (dr.getPieceIn().isWhite()!=this.isWhite()){
						toTake.add(dr);
					}
				}
			}
			catch(Exception e){}
		}
		/* if black */
		else{
			/* diagonal left */
			String DLcoordinate = this.makeCoordinate(this.getRowInt()-1, this.getColumnInt()+1);
			try{
				Square dl = m.getBoard().getSquare(DLcoordinate);
				if (!dl.hasPiece()){
					if (dl.getPieceIn().isWhite()!=this.isWhite()){
						toTake.add(dl);
					}
				}
			}
			catch(Exception e){}
			/* diagonal right */
			String DRcoordinate = this.makeCoordinate(this.getRowInt()-1, this.getColumnInt()-1);
			try{
				Square dr = m.getBoard().getSquare(DRcoordinate);
				if (!dr.hasPiece()){
					if (dr.getPieceIn().isWhite()!=this.isWhite()){
						toTake.add(dr);
					}
				}
			}
			catch(Exception e){}
		}
		this.setTakeTo(toTake);
	}

	@Override
	void move(Match m, String coordinate) {
		// TODO Auto-generated method stub

	}

	@Override
	void take(Match m, String coordinate) {
		// TODO Auto-generated method stub
		
	}

}
