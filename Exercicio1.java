package Controle;

import java.util.Scanner;

public class Exercicio1 {
	
	// Este programa mostra se o numero escolhido pelo usuario esta dentro de 0 a 100
	// E se o numero é par ou não
	
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);

	System.out.println("Digite um numero: ");
	int numero = entrada.nextInt();
	
	if (numero >= 0 && numero <= 100) {
		if (numero % 2 == 0) {
			System.out.println("O numero " + numero + 
					" esta entre 0 e 100, ele é par!");
		}else{
			System.out.println("O numero " + numero + 
					" esta entre 0 e 100, mas ele nao e par");
		}
	}	 else {
			System.out.println("O numero " + numero + 
					" nao esta entre 0 e 100");
	}
	
	System.out.println("FIM!");
	
	entrada.close();
}
}
