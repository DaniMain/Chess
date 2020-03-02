package pieces;

import java.util.HashSet;
import java.util.Set;

import board.Square;
import main.Match;

public class Queen extends Piece {

	public Queen(String name, String sym, boolean isWhite, String coordinate) {
		super(name, sym, isWhite, coordinate);
		// TODO Auto-generated constructor stub
	}

	@Override
	void searchToMove(Match m) {
		Set<Square> toMove = new HashSet<>();
		Set<Square> toTake = new HashSet<>();
		
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
