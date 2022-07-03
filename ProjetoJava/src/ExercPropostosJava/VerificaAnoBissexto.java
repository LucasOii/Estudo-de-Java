package ExercPropostosJava;
/** Autor: Lucas Oi; Data: 29/06/2022 */
// 8.Criar m�todo que verifica se um ano � bissexto.

import java.util.Scanner;

public class VerificaAnoBissexto {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int ano;
		
		System.out.println("Para verificar se � bissexto.");
		System.out.println("\nDigite um ano: ");
		ano = input.nextInt();
		
		if ( ano % 400 == 0 ) {
			System.out.println(ano + " � um ano bissexto! ");
		}
		else if ( ( ano % 4 == 0 ) && ( ano % 100 != 0 ) ) {
			System.out.println( ano + " � um ano bissexto! ");
		}
		else {
			System.out.println( ano + " n�o � um ano bissexto! ");
		}
	}
}
