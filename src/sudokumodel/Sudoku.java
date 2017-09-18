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
	private ArrayList<Group> blocs = new ArrayList<Group>();
	private ArrayList<Group> lines = new ArrayList<Group>();
	private ArrayList<Group> columns = new ArrayList<Group>();
	private ArrayList<Cell> cells = new ArrayList<Cell>();
	private ArrayList<HintSolver> hints = new ArrayList<HintSolver>();
	
	/**
	 * Créer une partie de Sudoku.
	 */
	public Sudoku(){
		//Vieille méthode
		/*Pour chaque type de Groupe
		for(int i = 0; i < 3; i++){
			//Créer 9 Groupe
			for(int j = 0; j < 9; j++){
				//Création bloc
				if(i == 1){
					this.blocs.add(new GroupBloc(j, this));
				}
				//Création lignes
				else if(i == 0){
					this.lines.add(new GroupLine(j, this));
				}
				//Création colonnes
				else if(i == 2){
					this.columns.add(new GroupColumn(j, this));
				}
			}
		}*/
		
		//Créer 9 Groupe
		for(int j = 0; j < 9; j++){
			this.blocs.add(new GroupBloc(j, this));
			this.lines.add(new GroupLine(j, this));
			this.columns.add(new GroupColumn(j, this));
		}

		for(int y = 0; y < 9;y++){
			for(int x = 0; x < 9; x++){
				this.cells.add(new Cell(this.lines.get(x),this.columns.get(y), this.blocs.get(1)));
			}
		}
	}

	@Override
	public void init(String grid) {
		this.grilleInitialisee = true;
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
