

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Convertidor {
	
	public static String convertir(String str) {
		char caracterAnterior= ' ';
		String stringConvertido = "";
		stringConvertido = str.replaceAll("i", "wi");
		stringConvertido = stringConvertido.replaceAll("e", "we");
		
		
		return (stringConvertido + " owo");
	}
	
	public static int countVowels(String str) {
		String expR = "[aAeEiIoOuU]";
		Pattern patron = Pattern.compile(expR);
		Matcher emparejador = patron.matcher(str);
		int contador = 0;
		
		while (emparejador.find()) {
			contador++;
		}
		
		return contador;
	}
	
	public static boolean doubleLetters(String str) {
		String expR = "(.)\\1";
		Pattern patron = Pattern.compile(expR, Pattern.CASE_INSENSITIVE);
		Matcher emparejador = patron.matcher(str);
		
		return emparejador.find();
	}
	
	public static String removeVowels(String str) {
		str = str.replaceAll("a", "");
		str = str.replaceAll("e", "");
		str = str.replaceAll("i", "");
		str = str.replaceAll("o", "");
		str = str.replaceAll("u", "");
		
		return str;
	}
	
	public static boolean busca_3a(String cadena) {
		String expR = ".[aA].[aA].[aA]";
		
		Pattern pat = Pattern.compile(expR);
		Matcher mat = pat.matcher(cadena);
		
		return mat.matches();
	}
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		String cadena = leer.nextLine();
		
		System.out.println(removeVowels(cadena));
		
	}
}
