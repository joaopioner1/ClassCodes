package arraysEx;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner | Date: 08/07/2021
		Scanner in = new Scanner(System.in);
		
		Integer[] A = new Integer[20];

		for (int i = 0; i < A.length; i++) {
			A[i] = 10;
			A[i] += 10 * i;
		}
		
		for (int j = 0; j < A.length; j++) {
			System.out.println(A[j]);
		}
		in.close();
	}

}

/*

Preencher um array A de 20 elementos (�ndices de 0 a 19) com os n�meros inteiros 10,20,30,40,50,...,200. 
Escrever o array A ap�s o seu total preenchimento. Observe que existe uma rela��o entre o �ndice e o valor 
armazenado na posi��o do array.

*/