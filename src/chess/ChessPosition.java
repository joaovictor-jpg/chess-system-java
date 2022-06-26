package chess;

import boardgame.Position;

public class ChessPosition {

	private Character column;
	private Integer row;

	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Erro instantianting chessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}

	public Character getColumn() {
		return column;
	}

	public Integer getRow() {
		return row;
	}

	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}

	protected ChessPosition fromPosition(Position position) {
		return new ChessPosition((char) ('a' - position.getColumn()), 8 - position.getRuw());
	}

	@Override
	public String toString() {
		return "" + column + row;
	}

}
