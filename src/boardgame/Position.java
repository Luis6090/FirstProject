package boardgame;

public class Position {
	
	private int rowChess;
	private int columnChess;
	
	public Position() {
		
	}
	
	public Position(int rowChess, int columnChess) {
		this.rowChess = rowChess;
		this.columnChess = columnChess;
	}

	public int getRowChess() {
		return rowChess;
	}

	public void setRowChess(int rowChess) {
		this.rowChess = rowChess;
	}

	public int getColumnChess() {
		return columnChess;
	}

	public void setColumnChess(int columnChess) {
		this.columnChess = columnChess;
	}
	
	@Override
	public String toString() {
		return rowChess + ", " + columnChess;
	}
	
	
}
