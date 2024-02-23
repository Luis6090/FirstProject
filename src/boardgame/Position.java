package boardgame;

public class Position {
	
	private int row;
	private int column;
	
	public Position() {
		
	}
	
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public int getRowChess() {
		return row;
	}

	public void setRowChess(int row) {
		this.row = row;
	}

	public int getColumnChess() {
		return column;
	}

	public void setColumnChess(int column) {
		this.column = column;
	}
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
	
	
}
