package MetodosJava;

public class Carro {
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	
	// metodo liga indica que o carro est� ligado
	void ligar() {
		System.out.println("O carro est� ligado...");
	}
	// metodo com parametro double quantiade
	void acelera(double quantidade) {
		double velocidadeNova = this.velocidadeAtual+quantidade;// variavel local veloNova criada,  
		this.velocidadeAtual = velocidadeNova; // ATravez da  do calculo da veloNova, atualiza veloAtual
	}
	// Pega marcha vai verificar a velocidade atual e retorna um valor.
	int pegaMarcha() {
		if(this.velocidadeAtual<0) {
			return -1;
		}
		if(this.velocidadeAtual>=0 && this.velocidadeAtual<40) {
			return 1;
		}
		if(this.velocidadeAtual>=40 && this.velocidadeAtual<80) {
			return 2;
		}
		return 3;
	}	
}
