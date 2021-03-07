package exo9;
import java.util.function.Predicate;
public class PlayWithLamda {

	public static void main(String[] args) {
		

		
				
				//retourne true si cette chaîne fait plus de 4 caractères
				Predicate<String> p = (String s) -> s.length()>4 ;
				System.out.println("La chaine de caractère celina : " + p.test("celina"));
				
				//retourne true si cette chaîne est non vide
				 
				
				Predicate<String> p1= s -> s.length()!=0;
				System.out.println("la chaine de caractere celina : " + p1.test("celina"));
				
				// retourne true si cette chaîne commence par un J
				
				
				Predicate<String> p2 = s -> s.startsWith("J");
				System.out.println("La chaine de caractere Jack : " + p2.test("Jack"));
				
				// retourne true si cette chaîne fait exactement 5 caractères de long
				
				Predicate<String> p3 = s -> s.length()==5;
				System.out.println("La chaine de caractere celyouna : " + p3.test("celyouna"));
				
				//retourne true si cette chaîne commence par un J et fait exactement 5 caractères de long
				
				Predicate<String> p4 = s -> s.length()==5 && s.startsWith("J");
				System.out.println("La chaine de caractere Jamais : " + p4.test("Jamais"));


	}

}
