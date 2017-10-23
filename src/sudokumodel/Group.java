/**
 * 
 */
package sudokumodel;

/**
 * @author ribb0001, lege0007
 *
 */
public abstract class Group {

	private int groupNumber;
	private Sudoku sudoku;
	protected int[] cells;

	/**
	 * Créer un groupe
	 * @param groupNumber
	 * @param sudoku
	 */
	protected Group(int groupNumber, Sudoku sudoku){
		this.groupNumber=groupNumber;
		this.sudoku=sudoku;
		this.cells = new int[9];
	}

	public int getGroupNumber(){
		return this.groupNumber;
	}

	public Cell getCell(int cellNumber){		
		return this.sudoku.getCell(this.cells[cellNumber]);
	}
	/*
	public boolean isCandidate(int value){
		for(int i = 0; i < 9; i++){

		}

	}*/

	public boolean checkError(int value){
		boolean erreur=false;
		int x=0;
		for (int i=0; i<9;i++){
			if(this.cells[i] == value){
				x=x+1;
			}
		}
		if (x>=2){
			erreur=true;
		}
		return erreur;
	}
	
	public boolean isCandidate(int value){
		boolean res = true;
		for(int i = 0; i < 9; i++){
			if(value == this.sudoku.getCell(this.cells[i]).getValue()){
				res = false;
			}
		}
		return res;
		
	}

}