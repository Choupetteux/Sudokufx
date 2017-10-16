package sudokumodel;

public class GroupColumn extends Group {

	public GroupColumn(int groupNumber, Sudoku sudoku) {
		super(groupNumber, sudoku);
		for(int i = 0; i<9; i++){
			this.cells[i] = this.getGroupNumber() + (9*i);
		}
	}

}
