package ExercPropostosJava;
/** Autor: Lucas Oi; Data: 28/06/2022 */
// Crie um m�todo que receba 3 n�meros, informa qual � o maior e o menor n�mero

import java.util.Scanner;

public class IndentificaNumMaiorMenor {
	public static void main(String[] args) 
	{
		// 1� Metodo com entrada de numeros n�o repetidos	
		
		Scanner input = new Scanner (System.in);
		//int biggest = maximum( 1,2,3 );
		
		int numero1, numero2, numero3, maior, menor;
		
		System.out.println("\n Entre com o 1� valor: ");
		numero1 = input.nextInt();
				
		System.out.println("\n Entre com o 2� valor: ");
		numero2 = input.nextInt();
		
		System.out.println("\n Entre com o 3� valor: ");
		numero3 = input.nextInt();
		
		if (numero1 < numero2 && numero2 < numero3 && numero1 < numero3 )
		{
			System.out.println("\n O maior valor �: " + numero3);
			System.out.println("\n O menor valor �: " + numero1);
		}
		
		else if (numero1 < numero2 && numero3 < numero2 && numero1 < numero3 )
		{
			System.out.println("\n O maior valor �: " + numero2);
			System.out.println("\n O menor valor �: " + numero1);
		}
		else if (numero2 < numero3 && numero3 < numero1 && numero2 < numero1 )
		{
			System.out.println("\n O maior valor �: " + numero1);
			System.out.println("\n O menor valor �: " + numero2);
		}
		
		else if (numero2 < numero1 && numero1 < numero3 && numero2 < numero3)
		{
			System.out.println("\n O maior valor �: " + numero3);
			System.out.println("\n O menor valor �: " + numero2);
		}
		
		
		else if (numero3 < numero2 && numero2 < numero1 && numero2 <= numero3)
		{
			System.out.println("\n O maior valor �: " + numero1);
			System.out.println("\n O menor valor �: " + numero3);
		}
		
		else if (numero3 < numero1 && numero1 < numero2 )
		{
			System.out.println("\n O maior valor �: " + numero2);
			System.out.println("\n O menor valor �: " + numero3);
		}
		else
		{
			System.out.println("\n Voc� digitou valores repetido! ");
		}
	}
		
		
	    // 2� Metodo com entrada de numeros repetidos	
	
		/*maior = numero1;
		menor = numero1;
		
		if (menor > numero2) {
			menor = numero2;
		}
		if (menor > numero3) {
			menor = numero3;
		}
		
		if (maior < numero2) {
			maior = numero2;
		}
		if (maior < numero3) {
			maior = numero3;
		}
				
		System.out.println("\n O maior valor: " + maior + "\tO menor valor: " + menor);
	}*/

}

	