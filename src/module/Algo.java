package module;

import java.util.Scanner;

public class Algo {

		

		 static int recherche(int [][] tab, int elt,int ligne,int colonne) {
			tab = new int[ligne][colonne];int i =0, j = 0;
			
			while((i < ligne) && (j < colonne) && (tab[i][j] != elt)) {
				i++;
				j++;
			}
			if((i >= ligne) && (j >= colonne)) {
				return -1;
			}
			else {
				return 1;
			}
		}
		 static int[][] nouvelleposition(int [][] tab,int ligne, int colonne,int elt,int i,int j){
			
			int tmp;tab = new int[ligne][colonne];
			
			for(int li =0; li< ligne; li++) {
				for(int col =0; col< colonne; col++) {
					
					if(tab[li][col] == elt) {
						
						tmp = tab[li][col];
						tab[li][col] = tab[i][j];
						tab[i][j] = tmp;
					}
				}
			
			}
			return tab;
		 }
			
			public static String toString(int [][]tab,int deb,int fin)
			{
				tab = new int[deb][fin];
				String out = "";
			
				for (int i=0; i<deb; i++)
				{
					for (int j=0; j<fin; j++)
						out +=tab[i][j]+"\t ";
						
						out+="\n";
				}
						
				return out;
			}
			
			
		
		//----------------------------------------------//
		//	   		  	 LAUNCH PROGRAM					   //
		//----------------------------------------------//
	
		 public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ligne,colonne;
		
	System.out.println("Entrer le nombre de lignes de votre matrice");
	ligne = sc.nextInt();
	
	System.out.println("Entrer le nombre de colonnes de votre matrice");
	colonne = sc.nextInt();
	
	int[][] mat = new int[ligne][colonne];
	
	System.out.println("Entrer les elements de votre matrice");
	for(int i =0; i<ligne; i++) {
		
		for(int j =0; j<colonne; j++) {
			
			System.out.println("Entrez l'element de la cellule"+" "+"["+i+","+j+"]");
			int value = sc.nextInt();
			mat[i][j] = value;
			
		}
	}
	
	System.out.println(toString(mat,ligne,colonne));
	
		
		System.out.println("Souhaitez-vous deplacer un element ?");
		String reponse = sc.nextLine();
		
		if(reponse == "oui"){
			
			while(reponse == "oui") {

			System.out.println("Quel element souhaitez-vous deplacer ?");
			int elt = sc.nextInt();
			
			int verif = recherche(mat,elt,ligne,colonne);
			if(verif == -1) {
				System.out.println("Désolé, veuillez entrer un element appartenant a la matrice");
			}
			else {
			
			System.out.println("S'il vous plait entrez la nouvelle position de l'element " + elt);
			System.out.println("entrez sa nouvelle position : ligne et colonne");
			System.out.println("Nouvelle ligne");
			int nvligne = sc.nextInt();
				
			System.out.println("Nouvelle colonne");
			int nvcolonne = sc.nextInt();
			
				mat = nouvelleposition(mat,ligne,colonne,elt,nvligne,nvcolonne);
			}
			
			System.out.println("Souhaitez-vous deplacer un autre element ?");
			reponse = sc.nextLine();
			}
		}
	
		System.out.println("Ceci est votre nouvelle disposition");
		
		System.out.println(toString(mat,ligne,colonne));
		
	sc.close();
	


	}

}
