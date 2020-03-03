package pieces;

import java.util.HashSet;
import java.util.Set;

import board.Square;
import main.Match;

public class Knight extends Piece {

	public Knight(String name, String sym, boolean isWhite, String coordinate) {
		super(name, sym, isWhite, coordinate);
		// TODO Auto-generated constructor stub
	}

	@Override
	void searchToMove(Match m) {
		Set<Square> toMove = new HashSet<>();
		Set<Square> toTake = new HashSet<>();
		int[] rowCoordinate = {this.getRowInt()+2, this.getRowInt()+2, this.getRowInt()+1,
				this.getRowInt()-1, this.getRowInt()-2, this.getRowInt()-2, this.getRowInt()-1,
				this.getRowInt()+1};
		int[] columnsCoordinate = {this.getColumnInt()-1, this.getColumnInt()+1, 
				this.getColumnInt()+2, this.getColumnInt()+2, this.getColumnInt()+1,
				this.getColumnInt()-1, this.getColumnInt()-2, this.getColumnInt()-2};
		for (int i=0;i<8;i++){
			int rowC = rowCoordinate[i];
			int columnC = columnsCoordinate[i];
			try{
				Square square = m.getBoard().getSquare(String.valueOf(rowC).concat(String.valueOf(columnC)));
				if (!square.hasPiece()){
					toMove.add(square);
				}
				else{
					if (square.getPieceIn().isWhite()!=this.isWhite()){
						toTake.add(square);
					}
				}
			}
			catch(Exception e){}
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
