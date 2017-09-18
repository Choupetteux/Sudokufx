package sudokumodel;

public class GroupColumn extends Group {

	public GroupColumn(int groupNumber, Sudoku sudoku) {
		super(groupNumber, sudoku);
		this.cells = new int[9];
	}

}
