package module;
import java.util.Scanner;
public class Test {
	
public static int compte(String phrase, String caractere){
int a,i,j;
a = 0;

StringBuffer Sb = new StringBuffer(phrase.length());
		
		for(i=0; i<phrase.length(); i++) {
			
                char c = caractere.charAt(i);
			for(j=0; j<phrase.length(); j++) {
				
			if(phrase.charAt(j) ==c){
			Sb.append(c);
			a++;
			}
			else{
				Sb.append(" ");
			}
		}
		}
		return a;
		}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	System.out.println("entrer votre expression reguliere");
	String regex = sc.nextLine();

	System.out.println("entrer le mot a verifier");
	String mot = sc.next();
	
		int cp = compte(regex,mot);
		System.out.println("on a "+ " "+ cp + " "+"caracteres trouves");
			
		}

	}


