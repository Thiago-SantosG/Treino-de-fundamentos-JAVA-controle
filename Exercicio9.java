package Controle;

import java.util.Scanner;

public class Exercicio9 {

	/*programa que recebe 10 valores e ao final imprima o maior número.
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int maiorValor = 0;
		int contador = 0;
		
		do {
			System.out.println("\n Digite um numero: ");
			int valor = entrada.nextInt();
			
			if (valor > maiorValor) {
				maiorValor = valor;
			}
			
			contador++;
		}while(contador != 10);
		
		System.out.printf("O maior valor foi: " + maiorValor);
		
		entrada.close();
	}
}
