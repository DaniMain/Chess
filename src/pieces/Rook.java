package pieces;

import java.util.HashSet;
import java.util.Set;

import board.Square;
import main.Match;

public class Rook extends Piece {

	public Rook(String name, String sym, boolean isWhite, String coordinate) {
		super(name, sym, isWhite, coordinate);
		// TODO Auto-generated constructor stub
	}

	@Override
	void searchToMove(Match m) {
		Set<Square> toMove = new HashSet<>();
		Set<Square> toTake = new HashSet<>();
		/* search up */
		for (int i=this.getRowInt()+1;i<=8;i++){
			String newCoordinate = this.makeCoordinate(i, this.getColumnInt());
			Square square = m.getBoard().getSquare(newCoordinate);
			if (!square.hasPiece()){
				toMove.add(square);
			}
			else{
				toTake.add(square);
				break;
			}
		}
		/* search down */
		for (int i=this.getRowInt()+1;i>=1;i--){
			String newCoordinate = this.makeCoordinate(i, this.getColumnInt());
			Square square = m.getBoard().getSquare(newCoordinate);
			if (!square.hasPiece()){
				toMove.add(square);
			}
			else{
				toTake.add(square);
				break;
			}
		}
		/* search right */
		for (int i=this.getColumn()+1;i<=8;i++){
			String newCoordinate = this.makeCoordinate(this.getRowInt(),i);
			Square square = m.getBoard().getSquare(newCoordinate);
			if (!square.hasPiece()){
				toMove.add(square);
			}
			else{
				toTake.add(square);
				break;
			}
		}
		/* search left */
		for (int i=this.getColumn()+1;i>=1;i--){
			String newCoordinate = this.makeCoordinate(this.getRowInt(),i);
			Square square = m.getBoard().getSquare(newCoordinate);
			if (!square.hasPiece()){
				toMove.add(square);
			}
			else{
				toTake.add(square);
				break;
			}
		}		
		this.setMoveTo(toMove);
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
