package aula2;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// Autor: Joao Vitor Souza Pioner | Data: 26/10/2020
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter one number: ");
		int number = in.nextInt();
		
		System.out.printf("the number multiplied by itself: %.0f", Math.pow(number, 2));
		
		in.close();
	}

}
/*
 * 3. Fa�a um programa capaz de obter um n�mero inteiro do usu�rio. Calcule o
 * quadrado deste n�mero, ou seja, multiplique o n�mero por ele mesmo. Ao final,
 * mostre o resultado na tela.
 */