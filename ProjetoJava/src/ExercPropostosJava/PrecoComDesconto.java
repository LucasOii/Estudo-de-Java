package ExercPropostosJava;
/** Autor: Lucas Oi; Data: 28/06/2022 */
// 7. Crie um m�todo que receba um pre�o e retorne o valor com 5% de desconto.

import java.util.Scanner;

public class PrecoComDesconto {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double preco, total, desconto, porcentagem = 5;
		
		System.out.printf("Digite o pre�o: " );
		preco = input.nextFloat();
		
		System.out.printf("\nO pre�o foi de: R$%.2f", preco);
		
		porcentagem = ( double )porcentagem / 100;
		
		desconto = preco * porcentagem;
		
		total = (preco - desconto);
		
		System.out.printf("\nO pre�o total com desconto foi de: R$%.2f", total);
		System.out.printf("\nO desconto foi de R$%.2f", desconto);
		System.out.println(". Ou seja: "+ porcentagem * 100 +"%" );
	}

}
