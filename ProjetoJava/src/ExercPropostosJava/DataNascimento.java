package ExercPropostosJava;
/** Autor: Lucas Oi; Data: 28/06/2022 */
// 4. Criar m�todo que receba o ano de nascimento de uma pessoa e retorne se ela � ou
//n�o maior de idade

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DataNascimento {

	public static void main(String[] args)
		{
			// 1� Metodo com entrada de data atual e data de nascimento. Intera��o "Dialog"
		
			/*int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Em que ano estamos?: "));
			int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Em que ano voc� nasceu?: "));
			int idade = anoAtual - anoNascimento;			
			
			JOptionPane.showMessageDialog(null,"Voce tem: "+idade+ " anos de idade");*/

			
			// 2� Metodo com data atual do sistema e entrada da data de nascimento.
			Calendar calendario = GregorianCalendar.getInstance();
			int anoAtual = calendario.get(Calendar.YEAR);
					
			Scanner input = new Scanner(System.in);
			System.out.println("Em que Ano voc� nasceu?: ");
			int anoNascimento = input.nextInt();
			System.out.println("Voce tem: " + (anoAtual - anoNascimento) + "anos");
			
		}
}
