package board;

import java.util.HashMap;
import java.util.Map;

import pieces.Piece;
import print.Print;

public class ChessBoard {
	
	private Map<String, Map<String, Square>> board;
	
	public ChessBoard(){
		this.board = new HashMap<String, Map<String,Square>>();
		Map<String, Square> line8 = new HashMap<>();
		Map<String, Square> line7 = new HashMap<>();
		Map<String, Square> line6 = new HashMap<>();
		Map<String, Square> line5 = new HashMap<>();
		Map<String, Square> line4 = new HashMap<>();
		Map<String, Square> line3 = new HashMap<>();
		Map<String, Square> line2 = new HashMap<>();
		Map<String, Square> line1 = new HashMap<>();
		
		/* LINE 1 */
		line1.put("A", new Square("A1"));
		line1.put("B", new Square("B1"));
		line1.put("C", new Square("C1"));
		line1.put("D", new Square("D1"));
		line1.put("E", new Square("E1"));
		line1.put("F", new Square("F1"));
		line1.put("G", new Square("G1"));
		line1.put("H", new Square("H1"));
		
		/* LINE 2 */
		line2.put("A", new Square("A2"));
		line2.put("B", new Square("B2"));
		line2.put("C", new Square("C2"));
		line2.put("D", new Square("D2"));
		line2.put("E", new Square("E2"));
		line2.put("F", new Square("F2"));
		line2.put("G", new Square("G2"));
		line2.put("H", new Square("H2"));
		
		/* LINE 3 */
		line3.put("A", new Square("A3"));
		line3.put("B", new Square("B3"));
		line3.put("C", new Square("C3"));
		line3.put("D", new Square("D3"));
		line3.put("E", new Square("E3"));
		line3.put("F", new Square("F3"));
		line3.put("G", new Square("G3"));
		line3.put("H", new Square("H3"));
		
		/* LINE 4 */
		line4.put("A", new Square("A4"));
		line4.put("B", new Square("B4"));
		line4.put("C", new Square("C4"));
		line4.put("D", new Square("D4"));
		line4.put("E", new Square("E4"));
		line4.put("F", new Square("F4"));
		line4.put("G", new Square("G4"));
		line4.put("H", new Square("H4"));
		
		/* LINE 5 */
		line5.put("A", new Square("A5"));
		line5.put("B", new Square("B5"));
		line5.put("C", new Square("C5"));
		line5.put("D", new Square("D5"));
		line5.put("E", new Square("E5"));
		line5.put("F", new Square("F5"));
		line5.put("G", new Square("G5"));
		line5.put("H", new Square("H5"));
		
		/* LINE 6 */
		line6.put("A", new Square("A6"));
		line6.put("B", new Square("B6"));
		line6.put("C", new Square("C6"));
		line6.put("D", new Square("D6"));
		line6.put("E", new Square("E6"));
		line6.put("F", new Square("F6"));
		line6.put("G", new Square("G6"));
		line6.put("H", new Square("H6"));
		
		/* LINE 7 */
		line7.put("A", new Square("A7"));
		line7.put("B", new Square("B7"));
		line7.put("C", new Square("C7"));
		line7.put("D", new Square("D7"));
		line7.put("E", new Square("E7"));
		line7.put("F", new Square("F7"));
		line7.put("G", new Square("G7"));
		line7.put("H", new Square("H7"));
		
		/* LINE 8 */
		line8.put("A", new Square("A8"));
		line8.put("B", new Square("B8"));
		line8.put("C", new Square("C8"));
		line8.put("D", new Square("D8"));
		line8.put("E", new Square("E8"));
		line8.put("F", new Square("F8"));
		line8.put("G", new Square("G8"));
		line8.put("H", new Square("H8"));

		this.board.put("1", line1);
		this.board.put("2", line2);
		this.board.put("3", line3);
		this.board.put("4", line4);
		this.board.put("5", line5);
		this.board.put("6", line6);
		this.board.put("7", line7);
		this.board.put("8", line8);
	}

	public Map<String, Map<String, Square>> getBoard() {
		return board;
	}

	public void setBoard(Map<String, Map<String, Square>> board) {
		this.board = board;
	}
	
	public Piece getPiece(String coordinate){
		String row = coordinate.substring(1, 2);
		String column = coordinate.substring(0, 1).toUpperCase();
		return board.get(row).get(column).getPieceIn();
	}
	
	public Square getSquare(String coordinate){
		String row = coordinate.substring(1, 2);
		String column = coordinate.substring(0, 1).toUpperCase();
		return board.get(row).get(column);
	}
	
	public void setSquare(String coordinate, Square newSquare){
		String row = coordinate.substring(1, 2);
		String column = coordinate.substring(0, 1).toUpperCase();
		Map<String, Square> newRow = this.board.get(row);
		newRow.put(column, newSquare);
		this.board.put(row, newRow);
	}
	
	public void printBoard(){
		int i8 = this.getSquare("A8").listToPrint().get(0).length();
		for (int i=0;i<i8;i++){
			if (i==2)
				Print.print("8");
			else
				Print.print(" ");
			for (Square squareIn8 : this.board.get("8").values()) {
				Print.print(squareIn8.listToPrint().get(i));
			}
			Print.println();
		}

		for (int i=0;i<i8-1;i++){
			if (i==1)
				Print.print("7");
			else
				Print.print(" ");
			for (Square squareIn7 : this.board.get("7").values()) {
				Print.print(squareIn7.listToPrint().get(i));
			}
			Print.println();
		}
		
		for (int i=0;i<i8-1;i++){
			if (i==1)
				Print.print("6");
			else
				Print.print(" ");
			for (Square squareIn6 : this.board.get("6").values()) {
				Print.print(squareIn6.listToPrint().get(i));
			}
			Print.println();
		}
		
		for (int i=0;i<i8-1;i++){
			if (i==1)
				Print.print("5");
			else
				Print.print(" ");
			for (Square squareIn5 : this.board.get("5").values()) {
				Print.print(squareIn5.listToPrint().get(i));
			}
			Print.println();
		}
		
		for (int i=0;i<i8-1;i++){
			if (i==1)
				Print.print("4");
			else
				Print.print(" ");
			for (Square squareIn4 : this.board.get("4").values()) {
				Print.print(squareIn4.listToPrint().get(i));
			}
			Print.println();
		}
		
		for (int i=0;i<i8-1;i++){
			if (i==1)
				Print.print("3");
			else
				Print.print(" ");
			for (Square squareIn3 : this.board.get("3").values()) {
				Print.print(squareIn3.listToPrint().get(i));
			}
			Print.println();
		}
		
		for (int i=0;i<i8-1;i++){
			if (i==1)
				Print.print("2");
			else
				Print.print(" ");
			for (Square squareIn2 : this.board.get("2").values()) {
				Print.print(squareIn2.listToPrint().get(i));
			}
			Print.println();
		}
		
		for (int i=0;i<i8-1;i++){
			if (i==1)
				Print.print("1");
			else
				Print.print(" ");
			for (Square squareIn1 : this.board.get("1").values()) {
				Print.print(squareIn1.listToPrint().get(i));
			}
			Print.println();
		}
		
		Print.println("   A   B   C   D   E   F   G   H  ");
		
	}

}
