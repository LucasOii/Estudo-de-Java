package ExercPropostosJava;
/** Autor: Lucas Oi; Data: 30/06/2022 */
// 9.Criar m�todo que verifique se uma letra � vogal ou consoante.

import java.util.Scanner;

public class VerificaVogalOuConsoante {

	static String isVowel(char ch) {
		String str = "aeiouAEIOU";
		return (str.indexOf(ch) != -1) ? "Vogal":"Constante";
	}
	
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Isso � uma "+isVowel('a'));
		System.out.println("Isso � uma "+isVowel('x'));
	}
}

