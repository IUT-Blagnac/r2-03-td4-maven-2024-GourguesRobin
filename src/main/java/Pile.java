public class Pile {
	private int []elements;	
	private int indiceSommet ;
	
/**
     * Constructeur avec paramètres d'objets de classe Pile
	 * @param pfelement IN : les élement dans le tableau 
     */
Pile (int pfelement){
	this.elements = new int [pfelement];
	this.indiceSommet = -1;
}
/**
     * Vérifie si la pile est vide 
     * 
     * @param pile IN : La pile a vérifié son contenu 
     * 
     * @return true si la pile est vide ,sinon false
     */
public  boolean estVide() {
	try {
		if(this.indiceSommet == -1 ) {
			return true ; 
		}
	} catch (Exception e) { }
	return false ;
}
/**
     * Vérifie si la pile est pleine 
     * 
     * @param pile IN : La pile dans la quelle on vérifie si elle est pleine 
     * @return true si la pile est pleine ,sinon false
     */
public  boolean estPlein() {
	if (this.indiceSommet == this.elements.length) {
		return true;
	}
	return false;
}
/**
     * Empile un élements sur la pile 
     * 
     * @param pile IN : La pile dans la quelle les elements vont s'empiler
     * @param elem IN : élement a empiler 
	 * @throws Exception IN : la pile est pleine 
     */
public  int empiler (int elem) throws Exception{
	if (!estPlein() ) {
	this.indiceSommet = this.indiceSommet + 1 ; 
	this.elements[this.indiceSommet] = elem;
}
	else {
		throw new Exception ("La pile est pleine ");
	}
	return indiceSommet;
}
/**
     * Retire l'élement le plus haut de la pile 
     * 
     * @param pile IN : La pile dans laquelle l'élement est dépiler   
     * @throws Exception IN : La pile est vide
     */
public int depiler() throws Exception{
	
		if (!estVide()) {
			int a = this.elements[this.indiceSommet]; 
			this.indiceSommet = this.indiceSommet- 1 ;
		return a;
	}
		else{
		throw new Exception("La pile est vide");
	}
}
/**
     * Retourne l'élement le plus haut de la pile 
     * @return le sommet de la pile 
	 * @throws Exception IN : La pile est vide 
     */
public int sommet() throws Exception {
	if( !estVide() ) {
	return this.indiceSommet;
} else {
	throw new Exception ("La pile est vide");
}
}

/**
	* Vide entierement la pile 
    *@throws Exception IN : La pile est vide
*/
public void vider() throws Exception{
	if (!estVide()) {
		this.indiceSommet = -1 ;
	}
		else {
			throw new Exception("La pile est vide");
		}
	}
}