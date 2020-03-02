package pieces;
import java.util.HashSet;
import java.util.Set;

import board.*;
import main.*;

public abstract class Piece {
	
	private String name;
	private String sym;
	private String coordinate;
	private Set<Square> squaresTo;
	
	public Piece(String name, String sym, String coordinate){
		this.name = name;
		this.sym = sym;
		this.coordinate = coordinate;
		this.squaresTo = new HashSet<>();
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

	public String getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(String coordinate) {
		this.coordinate = coordinate;
	}

	public Set<Square> getSquaresTo() {
		return squaresTo;
	}

	public void setSquaresTo(Set<Square> squaresTo) {
		this.squaresTo = squaresTo;
	}

	@Override
	public String toString() {
		return "Piece [name=" + name + ", symbol=" + sym + "]";
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

	abstract void move(Match m, String coordinate);

}
