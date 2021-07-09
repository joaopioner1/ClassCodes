package arraysEx;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner | Date: 08/07/2021
		Scanner in = new Scanner(System.in);
		
		Double[] array = new Double[4];
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("Insira um numero: ");
			array[i] = in.nextDouble();
		}
		
		Double sum = array[0] + array[2];
		Double sub = array[3] - array[1];
		Double mul = array[2] * array[1];
		
		System.out.printf("SUM: %.2f\n", sum);
		System.out.printf("SUB: %.2f\n", sub);
		System.out.printf("MUL: %.2f\n", mul);

		in.close();
	}

}
/*

a�a um programa em Java e crie um array de tamanho 4. 
Leia os 4 valores num�ricos com v�rgula e armazeneos diretamente no array. 
Mostre o resultado da soma do 1� com 3�. A subtra��o do 4� pelo 2�. A multiplica��o 
do 3� pelo 2�.


*/