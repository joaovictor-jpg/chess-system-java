package boardgame;

public class Position {

	private Integer row;
	private Integer column;

	public Position(Integer ruw, Integer column) {
		this.row = ruw;
		this.column = column;
	}

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer ruw) {
		this.row = ruw;
	}

	public Integer getColumn() {
		return column;
	}

	public void setColumn(Integer column) {
		this.column = column;
	}
	
	public void setValue(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	@Override
	public String toString() {
		return this.getRow() + ", " + this.getColumn();
	}

}
