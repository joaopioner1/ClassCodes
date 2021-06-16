package Exercicios1_modulo2;

import java.util.Scanner;

public class aula1 {

	public static void main(String[] args) {
		// Author: Jo�o V�tor Souza Pioner | Date: 16/02/21

		Scanner input = new Scanner(System.in);

		double peso, nota; // Vari�veis
		int idade, ano;

		System.out.println("Insira sua idade: "); // Recebendo informa��es
		idade = input.nextInt();
		System.out.println("Insira sua nota: ");
		nota = input.nextDouble();
		System.out.println("Insira o ano que voc� est�: ");
		ano = input.nextInt();
		System.out.println("Insira seu peso: ");
		peso = input.nextDouble();

		if (nota >= 7) { // Condi��es
			System.out.println("Nota maior que 7.");
		} else {
			System.out.println("Nota menor que 7.");
		}
		if (idade >= 16) {
			System.out.println("Voc� PODE votar no Brasil.");
		} else {
			System.out.println("Voc� N�O pode votar no Brasil.\nVoc� tem menos que 16 anos de idade.");
		}
		if (idade > 59) {
			System.out.println("Voc� possui mais de 59 anos de idade. Considerado idoso.");
		}
		if (ano != 1889) {
			System.out.println("N�o � o ano da proclama��o da rep�blica.");
		}
		if (ano == 2021) {
			System.out.println("2021. Voc� est� no mesmo ano que este programa foi feito.");
		}
		if (ano == 2006) {
			System.out.println("2006. Nesse ano o Internacional foi campe�o do mundo.");
		}
		if (peso != 70) {
			System.out.println("N�o pesa 70 kilogramas.");
		}
		
		input.close(); 
	}
}