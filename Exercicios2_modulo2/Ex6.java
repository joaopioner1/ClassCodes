package Exercicios2_modulo2;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// Author: Jo�o V�tor Souza Pioner | Date: 17/02/2021
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira o ano que voc� nasceu: ");
		int anoNasc = input.nextInt();
		
		if (anoNasc <= 2005) {
			System.out.println("Voc� pode votar neste ano (2021).\nIdade: " + (anoNasc - 2021));
		} else { 
			System.out.println("Voc� N�O poder� votar neste ano (2021).\nIdade: " + (2021 - anoNasc));
		}
		
		input.close();
	}
}
