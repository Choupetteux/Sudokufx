package sudokumodel;

import java.util.ArrayList;

/**
 * Interface d'accès en lecture aux données des cellules du modèle pour l'application sudokuFX.
 * @author Didier Gillard
 */
public interface CellValue {
	
	/**
	 * indique si la cellule contient une valeur <b>initiale</b> autre que zéro
	 * @return vrai si la cellule contient une valeur initiale autre que zéro
	 */
	public boolean isInitialValue();
	
	/**
	 * accesseur à la valeur mémorisée par la cellule
	 * @return la valeur mémorisée par cette cellule - zéro indique une cellule vide 
	 */
	public int getValue();
	
	/**
	 * permet la récupération des candidats possibles pour cette cellule.
	 * @return la liste des candidats possibles pour cette cellule
	 */
	public ArrayList<Integer> getCandidates();
	
	/**
	 * indique si la valeur contenue dans cette cellule, autre que zéro, est en conflit avec une valeur identique dans un des groupes de cette cellule : ligne, colonne ou bloc
	 * @return vrai si un conflit existe pour cette valeur
	 */
	public boolean isError();
}
