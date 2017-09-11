/**
 * 
 */
package sudokumodel;

import java.util.ArrayList;

/**
 * @author ribb0001, lege0007
 *
 */
public class Sudoku implements SudokuModel{
	
	private boolean grilleInitialisee = false;
	private ArrayList<Group> blocs;
	private ArrayList<Group> lines;
	private ArrayList<Group> columns;
	private ArrayList<Cell> cells;
	private ArrayList<HintSolver> hints;
	
	/**
	 * Créer une partie de Sudoku.
	 */
	public Sudoku(){
		
	}

	@Override
	public void init(String grid) {
		// TODO Auto-generated method stub	
	}

	@Override
	public boolean isInit() {
		return this.grilleInitialisee;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isValide() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CellValue getCellValue(int cellNumber) {
		return this.cells.get(cellNumber);
	}

	@Override
	public boolean setValue(int value, int cellNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void computeCandidates() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void toggleCandidate(int digit, int cellNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean solve() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String hint() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Group getColumn(int colNumber){
		return this.columns.get(colNumber);
	}
	
	public Group getLine(int lineNumber){
		return this.lines.get(lineNumber);
	}
	
	public Group getBloc(int blocNumber){
		return this.blocs.get(blocNumber);
	}
	
	public Cell getCell(int cellNumber){
		return this.cells.get(cellNumber);
	}
	
}
