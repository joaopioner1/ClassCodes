package aula2;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter one number: ");
		int number1 = in.nextInt();
		System.out.print("Enter one number: ");
		int number2 = in.nextInt();
		System.out.print("Enter one number: ");
		int number3 = in.nextInt();
		
		int sum = number1 + number2;
		int sub = number2 - number3;
		
		System.out.printf("Sum: %d\nSubtraction: %d", sum, sub);
		
		in.close();
	}

}
/*
 * Fa�a um programa capaz de obter tr�s n�meros inteiros do usu�rio. Ent�o
 * calcule a soma do primeiro com o segundo e a subtra��o do segundo pelo
 * terceiro. Ao final, mostre os resultados na tela.
 */