package Controle;

import java.util.Scanner;

public class Exercicio3 {

		/* Calculo de media 
		 * 
		 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7) {
			System.out.println("Sua media e " + media + " parabens voce foi aprovado!");
		}if (media >= 4) {
			System.out.println("Sua media e " + media + " voce esta de recuperacao, estude mais!");
		}else {
			System.out.println("Sua media e " + media + " voce foi reprovado!");
		}
		
		entrada.close();
	}
}
