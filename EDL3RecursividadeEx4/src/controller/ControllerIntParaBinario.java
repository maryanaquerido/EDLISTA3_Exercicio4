package controller;

public class ControllerIntParaBinario {
	public ControllerIntParaBinario () {
		super ();
		
	}
	
	public String IntParaBinario (int num) {
		if (num == 0) { // CONDIÇÃO DE PARADA: QUANDO NUM FOR 0, NÃO EXISTEM MAIS DIVISÕES PARA FAZER ENTÃO RETORNAMOS UMA STRING VAZIA.
			return "";
		}
		else {
			int resto = num%2;
			return IntParaBinario (num/2) + resto;
		}
	}

}

// COMO ESCREVER A FUNÇÃO PARA O TERMO N EM FUNÇÃO DO TERMO ANTERIOR? 
// QUANDO CHAMAMOS A FUNÇÃO ELA VERIFICA SE NUM É 0, SE NÃO ELA DIVIDE POR 2 E CONCATENA
// PARA RETORNAR A PRÓPRIA FUNÇÃO COM NUM/2 E O RESTO DA DIVISÃO. 


