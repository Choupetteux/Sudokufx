package sudokumodel;

public class GroupBloc extends Group{

	public GroupBloc(int groupNumber, Sudoku sudoku) {
		super(groupNumber, sudoku);
		for(int i = 0; i<9;i++){
			this.cells[i] = ((this.getGroupNumber() % 3) * 3) + (((this.getGroupNumber() / 3) * 3)*9);
		}
	}

}
