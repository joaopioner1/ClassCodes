package aula2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// Autor: Joao Vitor Souza Pioner | Data: 26/10/2020
		Scanner in = new Scanner(System.in);

		int n1, n2;

		System.out.print("Enter the first number: ");
		n1 = in.nextInt();
		System.out.print("Enter the second number: ");
		n2 = in.nextInt();

		System.out.println("The numbers entered were: " + n1 + " and " + n2);

		in.close();
	}

}
/*
 * 1. Fa�a um programa capaz de obter dois n�meros inteiros do usu�rio. Depois,
 * calcule a soma desses n�meros. Ao final, mostre o resultado da soma na tela
 * do computador.
 */