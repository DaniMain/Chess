package pieces;

import java.util.HashSet;
import java.util.Set;

import board.Square;
import main.Match;

public class King extends Piece {

	public King(String name, String sym, boolean isWhite, String coordinate) {
		super(name, sym, isWhite, coordinate);
		// TODO Auto-generated constructor stub
	}

	@Override
	void searchToMove(Match m) {
		Set<Square> toMove = new HashSet<>();
		Set<Square> toTake = new HashSet<>();		
		int[] rowCoordinate = {this.getRowInt()+1, this.getRowInt()+1, this.getRowInt(),
				this.getRowInt()-1, this.getRowInt()-1, this.getRowInt()-1, this.getRowInt(),
				this.getRowInt()+1};
		int[] columnsCoordinate = {this.getColumnInt(), this.getColumnInt()+1, 
				this.getColumnInt()+1, this.getColumnInt()+1, this.getColumnInt(),
				this.getColumnInt()-1, this.getColumnInt()-1, this.getColumnInt()-1};
		for (int i=0;i<8;i++){
			int rowC = rowCoordinate[i];
			int columnC = columnsCoordinate[i];
			try{
				String newCoordinate = String.valueOf(rowC).concat(String.valueOf(columnC));
				Square square = m.getBoard().getSquare(newCoordinate);
				/* if white king */
				if (this.isWhite()){
					Set<Piece> bpieces = m.getBoard().getBlackPieces();
					/* retrieve all square controlled by black */
					Set<Square> bcontrolled = new HashSet<>();
					for(Piece bp : bpieces){
						bcontrolled.addAll(bp.getMoveTo());
					}											
					/* king can move or take only if square has not controlled by black */
					if (!bcontrolled.contains(square)){
						if (!square.hasPiece()){
							toMove.add(square);
						}
						else{
							if (square.getPieceIn().isWhite()!=this.isWhite()){
								toTake.add(square);
							}
						}
					}
				}
				/* if black king */
				else{
					Set<Piece> bpieces = m.getBoard().getBlackPieces();
					/* retrieve all square controlled by white */
					Set<Square> bcontrolled = new HashSet<>();
					for(Piece bp : bpieces){
						bcontrolled.addAll(bp.getMoveTo());
					}											
					/* king can move or take only if square has not controlled by white */
					if (!bcontrolled.contains(square)){
						if (!square.hasPiece()){
							toMove.add(square);
						}
						else{
							if (square.getPieceIn().isWhite()!=this.isWhite()){
								toTake.add(square);
							}
						}
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
