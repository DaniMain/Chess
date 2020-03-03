package board;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import pieces.Bishop;
import pieces.King;
import pieces.Knight;
import pieces.Pawn;
import pieces.Piece;
import pieces.Queen;
import pieces.Rook;
import print.Print;

public class ChessBoard {
	
	private Map<String, Map<String, Square>> board;
	private Set<Piece> wpieces;
	private Set<Piece> bpieces;
	
	public ChessBoard(){
		this.board = new HashMap<String, Map<String,Square>>();
		Map<String, Square> line1 = new HashMap<>();
		Map<String, Square> line2 = new HashMap<>();
		Map<String, Square> line3 = new HashMap<>();
		Map<String, Square> line4 = new HashMap<>();
		Map<String, Square> line5 = new HashMap<>();
		Map<String, Square> line6 = new HashMap<>();
		Map<String, Square> line7 = new HashMap<>();
		Map<String, Square> line8 = new HashMap<>();
		
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
		
		createMatch();
	}
	
	private void createMatch(){
		/*PAWNS*/
		/* white */
		Piece wa = new Pawn("pawn", "P", true, "A2");
		Piece wb = new Pawn("pawn", "P", true, "B2");
		Piece wc = new Pawn("pawn", "P", true, "C2");
		Piece wd = new Pawn("pawn", "P", true, "D2");
		Piece we = new Pawn("pawn", "P", true, "E2");
		Piece wf = new Pawn("pawn", "P", true, "F2");
		Piece wg = new Pawn("pawn", "P", true, "G2");
		Piece wh = new Pawn("pawn", "P", true, "H2");
		/* black */
		Piece ba = new Pawn("pawn", "p", false, "A7");
		Piece bb = new Pawn("pawn", "p", false, "B7");
		Piece bc = new Pawn("pawn", "p", false, "C7");
		Piece bd = new Pawn("pawn", "p", false, "D7");
		Piece be = new Pawn("pawn", "p", false, "E7");
		Piece bf = new Pawn("pawn", "p", false, "F7");
		Piece bg = new Pawn("pawn", "p", false, "G7");
		Piece bh = new Pawn("pawn", "p", false, "H7");

		/* ROOKS */
		/* white */
		Piece wra = new Rook("rook", "R", true, "A1");
		Piece wrh = new Rook("rook", "R", true, "H1");
		/* black */
		Piece bra = new Rook("rook", "r", false, "A8");
		Piece brh = new Rook("rook", "r", false, "H8");
		
		/* KNIGTHS */
		/* white */
		Piece wkb = new Knight("knight", "N", true, "B1");
		Piece wkg = new Knight("knight", "N", true, "G1");
		/* black */
		Piece bkb = new Knight("knight", "n", false, "B8");
		Piece bkg = new Knight("knight", "n", false, "G8");
		
		/* BISHOPS */
		/* white */
		Piece wbc = new Bishop("bishop", "B", true, "C1");
		Piece wbf = new Bishop("bishop", "B", true, "F1");
		/* black */
		Piece bbc = new Bishop("bishop", "b", false, "C8");
		Piece bbf = new Bishop("bishop", "b", false, "F8");
		
		/* QUEEN */
		/* white */
		Piece wq = new Queen("queen", "Q", true, "D1");
		/* black */
		Piece bq = new Queen("queen", "q", false, "D8");
		
		/* KING */
		/* white */
		Piece wk = new King("king", "K", true, "E1");
		/* black */
		Piece bk = new King("king", "k", false, "E8");

		/* set all piece in pieces */
		/* white */
		this.wpieces.add(wa);
		this.wpieces.add(wb);
		this.wpieces.add(wc);
		this.wpieces.add(wd);
		this.wpieces.add(we);
		this.wpieces.add(wf);
		this.wpieces.add(wg);
		this.wpieces.add(wh);
		this.wpieces.add(wra);
		this.wpieces.add(wkb);
		this.wpieces.add(wbc);
		this.wpieces.add(wq);
		this.wpieces.add(wk);
		this.wpieces.add(wbf);
		this.wpieces.add(wkg);
		this.wpieces.add(wrh);
		/* black */
		this.bpieces.add(ba);
		this.bpieces.add(bb);
		this.bpieces.add(bc);
		this.bpieces.add(bd);
		this.bpieces.add(be);
		this.bpieces.add(bf);
		this.bpieces.add(bg);
		this.bpieces.add(bh);
		this.bpieces.add(bra);
		this.bpieces.add(bkb);
		this.bpieces.add(bbc);
		this.bpieces.add(bq);
		this.bpieces.add(bk);
		this.bpieces.add(bbf);
		this.bpieces.add(bkg);
		this.bpieces.add(brh);
		
		/* set all piece at its square */
		/* white */
		this.setSquare("A1", wra);
		this.setSquare("B1", wkb);
		this.setSquare("C1", wbc);
		this.setSquare("D1", wq);
		this.setSquare("E1", wk);
		this.setSquare("F1", wbf);
		this.setSquare("G1", wkg);
		this.setSquare("H1", wrh);
		this.setSquare("A2", wa);
		this.setSquare("B2", wb);
		this.setSquare("C2", wc);
		this.setSquare("D2", wd);
		this.setSquare("E2", we);
		this.setSquare("F2", wf);
		this.setSquare("G2", wg);
		this.setSquare("H2", wh);
		/* black */
		this.setSquare("A8", bra);
		this.setSquare("B8", bkb);
		this.setSquare("C8", bbc);
		this.setSquare("D8", bq);
		this.setSquare("E8", bk);
		this.setSquare("F8", bbf);
		this.setSquare("G8", bkg);
		this.setSquare("H8", brh);
		this.setSquare("A7", ba);
		this.setSquare("B7", bb);
		this.setSquare("C7", bc);
		this.setSquare("D7", bd);
		this.setSquare("E7", be);
		this.setSquare("F7", bf);
		this.setSquare("G7", bg);
		this.setSquare("H7", bh);
	}
	
	public void setSquare(String coordinate, Piece piece){
		String row = coordinate.substring(1, 2);
		String column = coordinate.substring(0, 1).toUpperCase();
		Map<String, Square> newRow = this.board.get(row);
		Square toSet = newRow.get(column);
		toSet.setPieceIn(piece);
		this.board.put(row, newRow);
	}

	public Map<String, Map<String, Square>> getBoard() {
		return board;
	}
	
	public Set<Piece> getWhitePieces() {
		return wpieces;
	}
	
	public Set<Piece> getBlackPieces() {
		return bpieces;
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
	
//	public void setSquare(String coordinate, Square newSquare){
//		String row = coordinate.substring(1, 2);
//		String column = coordinate.substring(0, 1).toUpperCase();
//		Map<String, Square> newRow = this.board.get(row);
//		newRow.put(column, newSquare);
//		this.board.put(row, newRow);
//	}
	
	public void printBoard(){
		int i8 = this.getSquare("A8").listToPrint().size();
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
