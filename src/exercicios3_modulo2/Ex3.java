package exercicios3_modulo2;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// Author: Jo�o V�tor Souza Pioner | Date: 23/02/2021
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de faltas do aluno: ");
		int faltas = input.nextInt();
		
		if (faltas >= 7) {
			System.out.println("eprovado por frequ�ncia! QUANTIDADE DE FALTAS: " + faltas);
		} else {
			System.out.println("Frequ�ncia suficiente para aprova��o!! QUANTIDADE DE FALTAS: " + faltas);
		}
		
		input.close();
	}

}
