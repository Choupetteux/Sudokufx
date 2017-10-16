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
	}

	public int getGroupNumber(){
		return this.groupNumber;
	}

	public Cell getCell(int cellNumber){		
		return this.sudoku.getCell(cellNumber);
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
			if(this.getCell(i).getValue()==value){
				x=x+1;
			}
		}
		if (x>=2){
			erreur=true;
		}
		return erreur;
	}
}