/**
 * 
 */
package sudokumodel;

import java.util.ArrayList;

/**
 * @author ribb0001, lege0007
 *
 */
public class Cell implements CellValue {
	private int value;
	private boolean initialValue = false;
	private boolean[] candidates = new boolean[10];
	private Group bloc;
	private Group column;
	private Group line;

	public Cell(Group ligne, Group colonne, Group bloc){
		this.value = 0;
		this.bloc = bloc;
		this.line = ligne;
		this.column = colonne;
	}

	@Override
	public boolean isInitialValue() {
		if(this.value != 0 && this.initialValue == true){
			return true;
		}
		else{
			return false;
		}
	}
	@Override
	public int getValue() {
		return this.value;
	}

	public void computeCandidates(){
		for(int i = 1; i < 10; i++){
			if(this.bloc.isCandidate(i) && this.line.isCandidate(i) && this.column.isCandidate(i)){
				this.candidates[i] = true;
			}
			else{
				this.candidates[i] = false;
			}
		}
	}



	@Override
	public boolean isError() {
		boolean res = false;
		int line = 0;
		int bloc = 0;
		int column = 0;
		if(this.value == 0){
			return res;
		}
		else{
			for(int i = 1; i < 9; i++){
				if(this.value == this.bloc.getCell(i).getValue()){
					bloc = bloc + 1;
				}
				if(this.value == this.line.getCell(i).getValue()){
					line = line + 1;
				}
				if(this.value == this.column.getCell(i).getValue()){
					column = column + 1;
				}
			}
			if(bloc >= 2 || line >= 2 || column >= 2){
				res = true;
			}
		}
		return res;
	}

	public Group getLine(){
		return this.line;
	}

	public Group getColumn(){
		return this.column;
	}

	public Group getBloc(){
		return this.bloc;
	}

	public boolean setValue(int value){
		this.value = value;
		return true;
	}

	public void setInitialValue(int value){
		this.value = value;
		this.initialValue = true;
	}

	public boolean isCandidate(int value){
		return this.candidates[value];
	}

	@Override
	public ArrayList<Integer> getCandidates(){
		ArrayList<Integer> liste= new ArrayList<Integer>();
		for (int i=1; i<10; i++){
			if (this.isCandidate(i)==true){
				liste.add(i);
			}
		}

		return liste;
	}

	public void toggleCandidate(int digit){
		if(this.candidates[digit] == true){
			this.candidates[digit] = false;
		}
		else if(this.candidates[digit] == false){
			this.candidates[digit] = true;
		}
	}
}

