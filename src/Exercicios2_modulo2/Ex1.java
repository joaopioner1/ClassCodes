package Exercicios2_modulo2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		//Author: Jo�o V�tor Souza Pioner | Date: 17/02/2021
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int valor = input.nextInt();
		
		if (valor > 0) {
			System.out.println("Valor positivo. N�mero digitado: " + valor);
		} else if (valor == 0) {
			System.out.println("N�mero neutro. N�mero digitado: " + valor);
		}
		else {
			System.out.println("Valor negativo. N�mero digitado: " + valor);
		}
		
		input.close();
	}

}
