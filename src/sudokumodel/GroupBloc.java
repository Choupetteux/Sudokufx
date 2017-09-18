package sudokumodel;

public class GroupBloc extends Group{

	public GroupBloc(int groupNumber, Sudoku sudoku) {
		super(groupNumber, sudoku);
		this.cells = new int[9];
	}

}
