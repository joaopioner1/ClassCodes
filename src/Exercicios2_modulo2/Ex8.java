package Exercicios2_modulo2;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// Author: Jo�o V�tor Souza Pioner | Date: 17/02/2021
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de ma�as que foram vendidas: ");
		int quantity = input.nextInt();
		
		if (quantity < 12) {
			System.out.printf("O pre�o a pagar pelas ma��s �: R$ %.2f", (quantity * 0.30));
		} else {
			System.out.printf("O pre�o a pagar pelas ma��s �: R$ %.2f", (quantity * 0.25));
		}
		
		input.close();
	}

}
