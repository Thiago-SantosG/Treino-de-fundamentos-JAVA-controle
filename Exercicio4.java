package Controle;

import java.util.Scanner;

public class Exercicio4 {
	
	// programa que receba um número e diga se ele é um número primo 
	
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);

		int contadorDeDivisores = 0;
		
		System.out.println("\n Digite um numero e verifique se ele e primo: ");
		int numero = entrada.nextInt();
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		
		if (contadorDeDivisores == 0) { 
			System.out.println("O numero " + numero + " e primo");
		}else {
			System.out.println("O numero " + numero + " nao e primo");
		}
				
		entrada.close();
	}
}
