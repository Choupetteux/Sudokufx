/**
 * 
 */
package sudokumodel;

/**
 * @author ribb0001, lege0007
 *
 */
public class Sudoku implements SudokuModel{
	
	private boolean grilleInitialisee = false;
	
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
		// TODO Auto-generated method stub
		return null;
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
}
