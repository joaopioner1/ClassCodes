package aula2;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter one number: ");
		int number = in.nextInt();

		System.out.printf("Number entered: %d\nThe two numbers after that are: %d and %d", number, (number + 1), (number + 2));

		in.close();
	}

}
/*
 * 4. Fa�a um programa capaz de obter um n�mero inteiro do usu�rio. Calcule os
 * pr�ximos dois n�meros que sucedem ao valor digitado pelo usu�rio. Mostre-os
 * na tela do computador. Por exemplo, se o usu�rio digitou o valor 12, o seu
 * programa dever� exibir os n�meros 13 e 14.
 */