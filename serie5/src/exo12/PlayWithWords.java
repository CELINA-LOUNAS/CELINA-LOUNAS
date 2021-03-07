package exo12;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PlayWithWords {

	public static void main(String[] args) {
List<String> words= Arrays.asList("one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve");
		
		//question 1
		words.forEach(s->System.out.println(s));
		
		//question 2
		
		List<String> list = new ArrayList<String>(words);
		list.removeIf(word->word.length()%2==0);	
		list.forEach(s->System.out.println(s));
			
		//question 3
		Function<String, String> majscule =  s -> s.toUpperCase();
		for (String s2 : words) {
		System.out.println(majscule.apply(s2));
		}
		System.out.println("\n est ce que le mot commence par une voyelle ");
		Predicate<String> Voyelle =s -> s.startsWith("a")||s.startsWith("e")||s.startsWith("i")||s.startsWith("o")||s.startsWith("u")||s.startsWith("y");
		for (String s : words) {
		System.out.println(Voyelle.test(s));
		}
		System.out.println("\n les mots qui commencent par une voyelle en majuscule ");
		for (String s : words) {
		if (Voyelle.test(s))
		System.out.println(majscule.apply(s));
		else 
		System.out.println(s);
		}
		

		//question 4
		Comparator<String> cmpByLength =Comparator.comparing(String::length);
		words.sort(cmpByLength);

		System.out.println("\n on compare la longueur:");
		words.forEach(s -> System.out.println(s));

		Comparator<String> cmpBylengthandalphabet=cmpByLength.thenComparing(String::toString);
		words.sort(cmpBylengthandalphabet);
		System.out.println("\n compare la longueur ensuite par ordre alphabetique:");
		words.forEach(s -> System.out.println(s));	
		
		

	}

}








