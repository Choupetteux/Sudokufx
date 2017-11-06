package sudokumodel;

public class GroupBloc extends Group{

	public GroupBloc(int groupNumber, Sudoku sudoku) {
		super(groupNumber, sudoku);
String s = "" + groupNumber + "  _ ";
		for(int i = 0; i<9;i++){
			if(i<3){
				this.cells[i] = ((this.getGroupNumber() % 3) * 3) + (((this.getGroupNumber() / 3) * 3)*9) + i;
			}
			else if(i>=3 && i<=5){
				this.cells[i] = ((this.getGroupNumber() % 3) * 3) + (((this.getGroupNumber() / 3) * 3)*9) + 9 + i-3;
			}
			else if(i>=6){
				this.cells[i] = ((this.getGroupNumber() % 3) * 3) + (((this.getGroupNumber() / 3) * 3)*9) + 18 + i-6;
			}
			s += "  " +i+":"+this.cells[i]; 
		}
//System.out.println(s);		
	}

}
