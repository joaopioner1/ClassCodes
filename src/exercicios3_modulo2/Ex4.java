package exercicios3_modulo2;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// Author: Jo�o V�tor Souza Pioner | Date: 23/02/2021
		Scanner input = new Scanner(System.in);

		System.out.print("Insira a nota 1: ");
		float nota1 = input.nextFloat();
		System.out.print("Insira a nota 2: ");
		float nota2 = input.nextFloat();
		System.out.print("Insira a nota 3: ");
		float nota3 = input.nextFloat();
		System.out.println("Insira a quantidade de faltas do aluno: ");
		int faltas = input.nextInt();

		double avg = (nota1 + nota2 + nota3) / 3;

		if (faltas < 7) {
			if (avg >= 7) {
				System.out.printf("Aluno APROVADO! M�dia: %.2f", avg);
			} else if (avg < 7 && avg >= 3) {
				System.out.printf("Aluno em RECUPERA��O! M�dia: %.2f\nInsira a nota 4: ", avg);
				float nota4 = input.nextFloat();
				avg = (nota1 + nota2 + nota3 + nota4) / 4;
				calcAprovamento(avg); // m�todo para ver se o aluno aprovou ou n�o
			} else {
				System.out.printf("Aluno REPROVADO! M�dia: %.2f", avg);
			}
		} else {
			System.out.println("Aluno reprovado por faltas!");
		}
		input.close();
	}

	public static void calcAprovamento(double avg) {
		if (avg >= 5) {
			System.out.printf("Aluno APROVADO! BOA SORTE! M�dia: %.2f", avg);
		} else {
			System.out.printf("Aluno REPROVADO! M�dia: %.2f", avg);
		}
	}

}
