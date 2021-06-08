package Exercicios2_modulo2;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// Author: Jo�o V�tor Souza Pioner | Date: 17/02/2021
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira um n�mero: ");
		double n1 = input.nextDouble();
		System.out.print("Insira outro n�mero: ");
		double n2 = input.nextDouble();
		
		if (n1 != n2) {
			if (n1 > n2) {
				System.out.println("O n�mero " + n1 + " (primeiro n�) � o maior.");
			} else {
				System.out.println("O n�mero " + n2 + " (segundo n�) � o maior.");
			}
		} else {
			System.out.println("Os n�meros s�o iguais.");
		}
		
		input.close();
	}
}
