package pieces;
import java.util.HashSet;
import java.util.Set;

import board.*;
import main.*;

public abstract class Piece {
	
	private String name;
	private String sym;
	private char row;
	private char column;
	private boolean isWhite;
	private Set<Square> moveTo;
	private Set<Square> takeTo;
	
	public Piece(String name, String sym, boolean isWhite, String coordinate){
		this.name = name;
		this.sym = sym;
		this.isWhite = isWhite;
		coordinate = coordinate.toUpperCase();
		this.row = getRow(coordinate);
		this.column = getColumn(coordinate);
		this.moveTo = new HashSet<>();
		this.takeTo = new HashSet<>();
	}
	
	abstract void searchToMove(Match m);

	abstract void move(Match m, String coordinate);
	
	abstract void take(Match m, String coordinate);
	
	public String makeCoordinate(int row, int column){
		String[] columns = {"A", "B", "C", "D", "E", "F", "G", "H"};
		return columns[column-1].concat(String.valueOf(row));
	}
	
	public char[] getCoordinate(String coordinate){
		return coordinate.toCharArray();
	}
	
	public char getRow(String coordinate){
		return getCoordinate(coordinate)[1];
	}
	
	public char getColumn(String coordinate){
		return getCoordinate(coordinate)[0];
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSym() {
		return sym;
	}

	public void setSym(String sym) {
		this.sym = sym;
	}

	public boolean isWhite() {
		return isWhite;
	}

	public void setIsWhite(boolean isWhite) {
		this.isWhite = isWhite;
	}

	public char getRow() {
		return row;
	}

	public void setRow(char row) {
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public void setColumn(char column) {
		this.column = column;
	}
	
	public int getRowInt(){
		return Integer.parseInt(String.valueOf(this.getRow()));
	}
	
	public int getColumnInt(){
		return this.getColumn()-64;
	}

	public Set<Square> getMoveTo() {
		return moveTo;
	}

	public void setMoveTo(Set<Square> moveTo) {
		this.moveTo = moveTo;
	}

	public Set<Square> getTakeTo() {
		return takeTo;
	}

	public void setTakeTo(Set<Square> takeTo) {
		this.takeTo = takeTo;
	}

	@Override
	public String toString() {
		String piece = "Piece [name = " + name+ " ";
		if (this.isWhite())
			piece += "white, ";
		else
			piece += "black, ";
		piece += "in ";
		piece += this.makeCoordinate(this.getRowInt(), this.getColumnInt()) + "]";
		return piece;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Piece other = (Piece) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
