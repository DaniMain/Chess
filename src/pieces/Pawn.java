package pieces;

import main.Match;

public class Pawn extends Piece {
	
	boolean isWhite;
	
	public Pawn(String name, String sym, String coordinate, boolean isWhite) {
		super(name, sym, coordinate);
		this.isWhite = isWhite;
	}

	@Override
	void move(Match m, String coordinate) {
		// TODO Auto-generated method stub

	}

}
