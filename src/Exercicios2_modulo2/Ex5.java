package Exercicios2_modulo2;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// Author: Jo�o V�tor Souza Pioner | Date: 17/02/2021
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira um n�mero: ");
		int numero = input.nextInt();
		
		if (numero >= 100) {
			System.out.println("O valor est� na faixa permitida.");
		} else {
			System.out.println("O valor est� fora da faixa permitida.");
		}
		
		input.close();
	}
}
