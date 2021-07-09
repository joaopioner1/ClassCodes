package arraysEx;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner | Date: 09/07/2021
		Scanner in = new Scanner(System.in);
		
		Double[] array = new Double[50];
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("Insira numero: ");
			array[i] = in.nextDouble();
		}
		System.out.println("\n--------------------\nPOSITIVE NUMBERS:\n");
		for (int j = 0; j < array.length; j++) {
			if (array[j] > 0) {
				System.out.println(array[j] + " na posi��o " + j);
			}
		}
		in.close();
	}

}

/*
Escreva um algoritmo que leia um array de 50 posi��es de n�meros com v�rgula (float ou double). Ap�s o 
t�rmino da leitura, mostre somente os positivos com suas respectivas posi��es (�ndices)
*/