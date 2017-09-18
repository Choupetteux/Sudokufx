package sudokumodel;

public class GroupLine extends Group{

	public GroupLine(int groupNumber, Sudoku sudoku) {
		super(groupNumber, sudoku);
		this.cells = new int[9];
	}

}
