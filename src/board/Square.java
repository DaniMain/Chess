package board;

import java.util.ArrayList;
import java.util.List;

import pieces.Piece;

public class Square {
	
	private String coordinate;
	private Piece pieceIn;
	private boolean hasPiece;
	
	public Square(String coordinate){
		this.coordinate = coordinate;
		this.pieceIn = null;
		this.hasPiece = false;
	}

	public String getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(String coordinate) {
		this.coordinate = coordinate;
	}

	public Piece getPieceIn() {
		return pieceIn;
	}

	public void setPieceIn(Piece pieceIn) {
		this.pieceIn = pieceIn;
		if(pieceIn!=null)
			this.setHasPiece(true);
		else
			this.setHasPiece(false);
	}

	public boolean hasPiece() {
		return hasPiece;
	}

	public void setHasPiece(boolean hasPiece) {
		this.hasPiece = hasPiece;
	}

	@Override
	public String toString() {
		return "Square [coordinate=" + coordinate + "]";
	}
	
	public List<String> listToPrint(){
		List<String> finalList = new ArrayList<String>();
		char[] coordinate = this.coordinate.toCharArray();
		boolean isA = false;
		boolean is8 = false;
		if (String.valueOf(coordinate[0]).toUpperCase().equals("A"))
			isA = true;
		if (String.valueOf(coordinate[1]).toUpperCase().equals("8"))
			is8 = true;
		
		/* inizial row */
		if (is8){
			StringBuilder sb0 = new StringBuilder();
			if (isA)
				sb0.append("+");
			sb0.append("---+");
			finalList.add(sb0.toString());
		}
		
		/* first row */
		StringBuilder sb1 = new StringBuilder();
		if (isA)
			sb1.append("|");
		if ((coordinate[0]+coordinate[1])%2==0)
			sb1.append("###|");
		else
			sb1.append("   |");
		finalList.add(sb1.toString());
		
		
		/* second row */
		StringBuilder sb2 = new StringBuilder();
		if (isA)
			sb2.append("|");
		if ((coordinate[0]+coordinate[1])%2==0){
			sb2.append(" ");
			try{
				sb2.append(this.getPieceIn().getSym());
			}
			catch(Exception e){
				sb2.append(" ");
			}
			sb2.append(" |");			
		}
		else{
			sb2.append(" ");
			try{
				sb2.append(this.getPieceIn().getSym());
			}
			catch(Exception e){
				sb2.append(" ");
			}
			sb2.append(" |");
		}
		finalList.add(sb2.toString());
		
//		/* third row */
//		StringBuilder sb3 = new StringBuilder();
//		if (isA)
//			sb3.append("|");
//		if ((coordinate[0]+coordinate[1])%2==0)
//			sb3.append("###|");
//		else
//			sb3.append("   |");
//		finalList.add(sb3.toString());
		
		/* final row */
		StringBuilder sb4 = new StringBuilder();
		if (isA)
			sb4.append("+");
		sb4.append("---+");
		finalList.add(sb4.toString());
		
		return finalList;
	}

}
