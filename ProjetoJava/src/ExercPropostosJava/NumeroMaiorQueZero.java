package ExercPropostosJava;
/**	Exerc�cio 1
	Crie uma aplica��o que leia 4 valores e retorne
	no console o valor maior que zero. Inserir os numeros = {200, -190, -20, 87};
*/

import java.util.Scanner;

public class NumeroMaiorQueZero {
	
	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		int numero;
		
		System.out.printf("\n Entre com um numero: ");
		numero = ler.nextInt();
		ler.nextLine(); // Limpando o Buffer de memoria
				
		System.out.printf("\n Numero: %d", numero); //%d do prinf: Pega valor tipo inteiro
		
		//La�o condicional (SE)
		if(numero>=1) {
			System.out.printf("\n Numero:"+numero+" maior que 0");
		}// At� aqui � um la�o de decis�o simples
		
		// Abaixo se torna um la�o de decis�o composto (SEN�O SE)
		else if (numero==0) { //&&: E
			System.out.printf("\n Numero:"+numero+" igual a 0");
		}
		
		// Abaixo (SEN�O)
		else {
			System.out.printf("\n Numero:"+numero+" menor que 0");
		}
	}
}