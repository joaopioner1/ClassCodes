package aula2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter one number: ");
		int number = in.nextInt();

		System.out.println("The number multiplied by 2 is: " + number * 2);

		in.close();
	}

}
/*
 * 2. Fa�a um programa capaz de obter um n�mero inteiro do usu�rio. Ent�o
 * multiplique esse n�mero por 2. Ao final, mostre o resultado na tela do
 * computador.
 */