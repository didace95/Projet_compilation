package module;
import java.util.Scanner;
import java.util.regex.Matcher;
public class Pattern {
	private static final Pattern TO = Pattern.TO.compile("(to)");
	public static void main(String[] args) {
		   
		Scanner sc = new Scanner(System.in);
		System.out.println("entrer une expression reguliere");
		String chaine = sc.nextLine();
		
		System.out.println("Entrer le mot a verifier l'appartenance");
		String search = sc.nextLine();
		
		int pos = chaine.indexOf(search);
		if((pos != -1)) {
		System.out.println("Il appartient bien a cette expression reguliere");
		}
		else {
		System.out.println("Il n'appartient pas a cette expression reguliere");

		}
		
		    
		 
		        String test = "to be or not to be";
		        Matcher m = ( TO). Matcher(test);
		        if (m.find()) {
		            int times = 1;
		            while (m.find()) times++;
		            System.out.println("j'ai trouvé : " + times + " fois le mot 'to'");
		        }
		    }
		

	}

}
