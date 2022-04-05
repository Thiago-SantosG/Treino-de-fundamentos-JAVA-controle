package Controle;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
	
	/*Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene
	 * um número aleatório em uma variável. O Jogador tem 10 tentativas para
	 * adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade
	 * de tentativas restantes, e imprima se o número inserido é maior ou menor do
	 * que o número armazenado.
	 */
	
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);

	int continuar;
	int numeroSorteado;
	int tentativas;
	int numero;
	
	 do {
		 System.out.println("Sorteando um numero entra 0 e 100... \n");
		 Random numeroAleatorio = new Random();
		 numeroSorteado = numeroAleatorio.nextInt(101);
		 
		 System.out.println("Comecou o jogo! Sera que voce consegue me vencer?");
		 tentativas = 0;
		 
		 do {
			 
		 tentativas++;
		 System.out.printf("Tentativas %d: ", tentativas);
		 numero = entrada.nextInt();
		 
		 if (numero > numeroSorteado) {
			System.out.printf("\n O numero sorteado e menor que %d\n", numero);
			
		}else if (numero < numeroSorteado) {
			System.out.printf("\n O numero sorteado e maior que %d\n", numero);
			
		}else {
			System.out.printf("\nParabens! Voce acertou o numero %d tentaivas! \n\n", tentativas);
		}
		 
		 }while(numero != numeroSorteado);
		 
		 System.out.println("Digite 0 para sair do jogo, ou qulquer outro numero para continuar.");
		 continuar = entrada.nextInt();
		 
	 }while(continuar != 0);
	 
	entrada.close();
	 }
}
