package Controle;

import java.util.Scanner;

public class Exercicio7 {

	/*programa que enquanto estiver recebendo números positivos,
	 * imprime no console a soma dos números inseridos, caso receba um número
	 * negativo, encerre o programa. Tente utilizar a estrutura do while.
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int somadorDeNumeros = 0;
		int numero = 0;
		
		while(numero >= 0) {
			System.out.println("Digite um numero inteiro (zero ou negativo para sair): ");
			numero = entrada.nextInt();
			
			if (numero >= 0) {
				somadorDeNumeros += numero; // aqui se trata do somadorDeNumeros = somadorDeNumeros + numero
				System.out.printf("\n Soma ate o presente momento: %d\n", somadorDeNumeros);
			}
		}
		entrada.close();
		
	}
}
