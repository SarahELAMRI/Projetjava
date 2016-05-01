import java.util.ArrayList;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		 Joueur [] listeJoueurs;
		Couleur [] listeCouleurs = Plateau.initialisationCarreRandom(13,13);
		ArrayList<Integer> l1= new ArrayList<Integer>();
		ArrayList<Integer> l2= new ArrayList<Integer>();
		HashSet<Integer> a1= new HashSet<Integer>();
		HashSet<Integer> a2= new HashSet<Integer>();
		
		l1.add(0);
		l2.add(1212);
		listeJoueurs=Joueur.initialisation2J(l1,l2,a1,a2,0,1);
		Tour.completerAccessibles(listeJoueurs[0], l1, 13, 13);
		Tour.completerAccessibles(listeJoueurs[1], l2, 13, 13);
		Fenetre fen= new Fenetre(listeCouleurs, listeJoueurs);
		
		Tour.tour(listeJoueurs,listeCouleurs,listeJoueurs[0], fen);
		
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

	//fonction qui renvoie true si l element est dans la liste

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


}
