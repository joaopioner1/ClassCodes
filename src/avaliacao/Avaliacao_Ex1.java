package avaliacao;

import java.util.Scanner;

public class Avaliacao_Ex1 {

	public static void main(String[] args) {
		// Autor: Joao Vitor Souza Pioner | Data: 4/11/2020 16:14
		Scanner input = new Scanner(System.in);

		// V�riaveis
		int numero1, numero2, numero3; // Utilizadas para entrada de dados
		int calculo; // utilizada para fazer o calc�lo

		// Imprimindo mensagens e utilizando v�riaveis
		System.out.println("-- PROGRAMA 1--\n");

		System.out.print("Insira o primeiro n�mero: ");
		numero1 = input.nextInt();
		System.out.print("Insira o segundo n�mero: ");
		numero2 = input.nextInt();
		System.out.print("Insira o terceiro n�mero: ");
		numero3 = input.nextInt();

		calculo = numero1 * numero2 - numero3;

		System.out.println("Resultado: " + calculo); // Mostra mensagem final no console

		input.close();
	}

}
