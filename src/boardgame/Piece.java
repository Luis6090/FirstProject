package boardgame;

public class Piece {
	
	private Board board;
	private Position position;
	
	public Piece() {
	}

	public Piece(Board board) {
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}
	
	
	
	
}
