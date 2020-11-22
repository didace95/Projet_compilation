package module;

import java.util.Scanner;

public class Compilation {

	public static void main(String[] args) {
		  
		        String search;int a = 0;
		        Scanner sc = new Scanner(System.in);
		        search = sc.nextLine();
		        final String SEPARATEUR = " ";
		        String conte = "Blanche-Neige et les sept nains";
		 
		        String mots[] = conte.split(SEPARATEUR);
		 
		        for (int i = 0; i < mots.length; i++) {
		 
		            if(mots[i].equals(search))
		            		a++;
		        	
		        }
		        
		        if (a !=0) {
		    System.out.println("Votre mot est bien accepté par cette expression reguliere et "+ a +" "+ "occurences");
	}
		        else {
		        	System.out.println("Votre mot n'est pas  accepté par cette expression reguliere");
		        }

}
}
