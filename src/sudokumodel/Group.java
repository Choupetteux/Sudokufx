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
	public Group(int groupNumber, Sudoku sudoku){
		this.groupNumber=groupNumber;
		this.sudoku=sudoku;
	}
	
	public int getGroupNumber(){
		return this.groupNumber;
	}
	
	public Cell getCell(int cellNumber){
		return this.sudoku.getCell(cellNumber);
	
	}
}
