package pieces;

import java.util.Set;

import board.Square;
import main.Match;

public class Queen extends Piece {

	public Queen(String name, String sym, boolean isWhite, String coordinate) {
		super(name, sym, isWhite, coordinate);
		// TODO Auto-generated constructor stub
	}

	@Override
	Set<Square> searchToMove(Match m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Set<Square> searchToTake(Match m) {
		// TODO Auto-generated method stub
		return null;
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
