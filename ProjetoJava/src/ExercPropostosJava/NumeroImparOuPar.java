package ExercPropostosJava;

import java.util.Scanner;

public class NumeroImparOuPar {
	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		int numero;
		int i = 0;
		
		System.out.printf("\n Entre com um numero: ");
		numero = ler.nextInt();
		ler.nextLine(); // Limpando o Buffer de memoria
		
		//La�o condicional (SE)
		if(numero%2==i) {
			System.out.printf("\n Numero digitado: "+numero+" � PAR");
		}// At� aqui � um la�o de decis�o simples
		
		// Abaixo se torna um la�o de decis�o composto (SEN�O SE)
		else if (numero%2!=i) { //&&: E
			System.out.printf("\n Numero digitado: "+numero+" � IMPAR");
		}
		
	}
}