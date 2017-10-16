package sudokumodel;

public class GroupLine extends Group{

	public GroupLine(int groupNumber, Sudoku sudoku) {
		super(groupNumber, sudoku);
		for(int i = 0; i<9;i++){
			this.cells[i] = (this.getGroupNumber() * 9) + i;
		}
	}

}
