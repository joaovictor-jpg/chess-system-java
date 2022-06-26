package boardgame;

public class Position {

	private Integer ruw;
	private Integer column;

	public Position(Integer ruw, Integer column) {
		this.ruw = ruw;
		this.column = column;
	}

	public Integer getRuw() {
		return ruw;
	}

	public void setRuw(Integer ruw) {
		this.ruw = ruw;
	}

	public Integer getColumn() {
		return column;
	}

	public void setColumn(Integer column) {
		this.column = column;
	}
	
	@Override
	public String toString() {
		return this.getRuw() + ", " + this.getColumn();
	}

}
