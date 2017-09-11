package sudokumodel;

/**
 * Interface utilisée par le solveur graphique de Sudoku SudokuFX.<br>
 * Le modèle de données doit obligatoirement implémenter cette interface
 * @author Didier Gillard
 * @see sudokumodel.Sudoku
 */
public interface SudokuModel {

	/**
	 * Permet d'initialiser les informations logiques d'une nouvelle grille de Sudoku à partir de la chaîne de caractères spécifiée.
	 * le model doit alors passer dans un état initialisé
	 * @see sudokumodel.SudokuModel#isInit() 
	 * @param grid chaine de 81 caractères, représenant les valeurs des 81 entiers compris entre 0 et 9 d'une grille initiale,
	 * 0 indique une case vide et les autres chiffres [1,9], une valeure initiale
	 */
	public void init(String grid);

	/**
	 * Permet de savoir si une grille a été initialisée
	 * @see sudokumodel.SudokuModel#init(String grid)
	 * @return vrai si la grille a été initialisé à l'aide de la méthode {@link sudokumodel.SudokuModel#init(java.lang.String)}
	 */
	public boolean isInit();

	/**
	 * permet de savoir si une grille est complétement remplie et ne contient plus aucune case vide
	 * @return vrai si toutes les cellules de la grille contiennent une valeur
	 */
	public boolean isFull();

	/**
	 * permet de savoir si une grille est résolue
	 * @return vrai si la grille est résolue
	 */
	public boolean isValide();

	/**
	 * permet l'accès aux informations de la cellule spécifiée via son interface {@link CellValue}
	 * @param cellNumber numéro de la cellule spécifiée
	 * @return l'interface {@link CellValue} de la cellule <i>cellNumber</i>
	 * @see sudokumodel.CellValue
	 */
	public CellValue getCellValue(int cellNumber);

	/**
	 * Tente d'affecter la valeur <i>value</i> à la cellule <i>cellNumber</i> par délégation de tache à la cellule ciblée.
	 * @param value valeur à affecter à la cellule spécifiée
	 * @param cellNumber numéro de la cellule concernée par l'affectation de la valeur spécifiée
	 * @return vrai si l'opération s'est effectuée correctement 
	 */
	public boolean setValue(int value, int cellNumber);

	/**
	 * Calcul des candidats possibles pour toutes les cellules de la grille de sudoku
	 */
	public void computeCandidates();

	/**
	 * bascule le <i>digit</i> candidat de la cellule <i>cellNumber</i> d'un état vrai vers l'état faux ou inversement
	 * @param digit valeur candidate
	 * @param cellNumber numéro de la cellule ciblée
	 */
	public void toggleCandidate(int digit, int cellNumber);

	/**
	 * Tente de résoudre le sudoku à partir de son état courant
	 * @return vrai si le sudoku a pu être résolu, faux en cas de grille incorrect (des valeurs incorrects ont été saisie par le joueur).
	 */
	public boolean solve();

	/**
	 * Demande d'un indice logique de résolution.
	 * @return une chaine de caractère contenant l'indice de résolution, null si aucun indice possible
	 */
	public String hint();

}