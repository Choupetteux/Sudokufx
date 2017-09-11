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
	
	@Override
	public boolean isInitialValue() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ArrayList<Integer> getCandidates() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isError() {
		// TODO Auto-generated method stub
		return false;
	}
}
