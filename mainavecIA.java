# Projetjava
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

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
		
		 //AJOUT D'UNE IA
        char r;
        System.out.println("Ajouter une IA (<O>ui, <N>on)");
        r = sc.nextLine().toUpperCase().charAt(0);
        if(r == 'O'){
            try{
                //CHOIX DE LA DIFFICULTE
                System.out.println("Avec quelle difficulté voulez vous jouer ?\n(1:facile, 2:difficile)");
                difficulty = sc.nextInt();
            
                //CHOIX DES IA
                for(int i=0; i<nombrePlayer-1; i++){
                    System.out.println("Mettre une IA sur quel joueur ? (N pour quitter)");
                    int x = sc.nextInt();
                    listeIA[x-1] = x;
                    
                }
            }catch(ArrayIndexOutOfBoundsException e1){}
            catch(InputMismatchException e2){}
            sc.nextLine();
        }
		
	}
	
	public static int courantPlayer = 0;
	public static Scanner sc = new Scanner(System.in);
    public static int nombrePlayer;
    public static int[] listeIA = new int[4];
    private static int difficulty = 0;
   
    

	
}
