# Projetjava
import java.util.ArrayList;
import java.util.HashSet;
public class Joueur 
{
private ArrayList<Integer> possessions;
private HashSet<Integer> accessibles;
private int codeCouleur;

public Joueur(ArrayList<Integer> possessions, HashSet<Integer> accessibles, int codeCouleur){
	this.possessions = possessions;
	this.accessibles = accessibles;
	this.codeCouleur = codeCouleur;
}

public ArrayList<Integer> getPossessions() {
	return possessions;
}

public int getCouleur() {
	return codeCouleur;
}

public void setCouleur(int nouveau) {
	 this.codeCouleur=nouveau;
}


public void addPossessions(ArrayList<Integer> ajout) {
	for(int i=0;i<ajout.size();i++)
	{
	 this.possessions.add(ajout.get(i));
	}
}
public void addAccessibles(ArrayList<Integer> ajout) {
	for(int i=0;i<ajout.size();i++){
		this.accessibles.add(ajout.get(i));
	}
}
public void addIntAccessibles(int ajout) {
	 this.accessibles.add(ajout);
}

public HashSet<Integer> getAccessibles() {
	return accessibles;
}
public static Joueur [] initialisation2J(ArrayList<Integer> l1, ArrayList<Integer> l2, HashSet<Integer> a1, HashSet<Integer> a2, int c1, int c2){
	Joueur joueur1= new Joueur(l1,a1,c1);
	Joueur joueur2= new Joueur(l2,a2,c2);
	Joueur [] listeJoueurs= new Joueur [2];
	listeJoueurs[0]=joueur1;
	listeJoueurs[1]=joueur2;
	return listeJoueurs;
}

// AI 

public static boolean choixCouleur(char coul, int joueur)
{
//Renvoyer true si la couleur choisie existe et n'est pas utilisée par l'autre joueur


	char[] all = {'r','o','j','ve','b','vi'};

	if(isIn(coul, all) && !isIn(coul, codeCouleur))
	{
		return true;
	}

return false;

}

public static boolean isIn(char element, char[] liste)
{

//fonction qui renvoie true si l'élement est dans la liste

for(int i=0; i<liste.length; i++)
{
	if (liste[i]==element) 
	{
		return true;
	}
	else 
	{
		return false;
	}

}

}

public static boolean isIn(int element, int[] liste)
{

//fonction qui renvoie true si l'element est dans la liste

for(int i=0; i<liste.length; i++)
{
	if (liste[i]==element) 
	{
		return true;
	}
	else 
	{
		return false;
	}

}
}

}

