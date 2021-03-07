package exo10;
import java.util.function.Function;
import java.util.function.BiFunction;

public class PlayWithFunction {

	public static void main(String[] args) {
				//question 1
				Function<String, String> f=(String s)->s.toUpperCase();
				System.out.println("celina en majuscule  "+f.apply("celina"));

				//question 2
				Function<String, String> f1=s-> {
				if (s.isEmpty())
				return "";
				else
				return s;
				};
				System.out.println("la chaine passé en argument est: "+f1.apply("celina"));


				//question 3
				Function<String, Integer> f2=s-> {
				if (s.isEmpty())
				return 0;
				else
				return s.length();
				};
				System.out.println("la chaine passé en argument est de longeur egale à: "+f2.apply("celina"));


				//question 4
				Function<String, String> f3=s-> {
				if (s.isEmpty())
				return "()";
				else
				return "("+s+")";
				};
				System.out.println("la chaine passé en argument est: "+f3.apply(""));

				// Question 5

				BiFunction<String, String,Integer> f4=(s1,s2)->s1.indexOf(s2);
				System.out.println("la position de la deuxieme chaine dans la premiere "+f4.apply("celina","el"));

				// Question 6

				Function<String,Integer> f5=s->f4.apply("abcdefghi",s);
				System.out.println("la position de la deuxieme chaine dans la premiere "+f5.apply("cd"));
				 	

	}

}
