package arraysEx;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner | Date: 09/07/2021
		Scanner in = new Scanner(System.in);
		
		Double[] array = new Double[10];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("INSIRA O PRECO DO PRODUTO: ");
			array[i] = in.nextDouble();
		}
		System.out.println("#-#-#-#-#-#-#-3-#-#");
		for (int j = 0; j < array.length; j++) {
			System.out.println("Valor R$ " + array[j] + " na posicao " + j);
		}
		
		char resp;
		do {
			System.out.println("Insira um indice: ");
			int indice = in.nextInt();
			System.out.println("Insira quantidade de produtos: ");
			int quantidade = in.nextInt();
			
			double preco = array[indice] * quantidade;
			System.out.printf("Valor total R$ %.2f", preco);
			
			System.out.print("\nQUER CONTINUAR COMPRANDO(s/n): ");
			resp = in.next().charAt(0);
		} while (resp != 'n');
		
		in.close();
	}
}
/*
Fa�a um programa na linguagem JAVA com um array para armazenar o pre�o de 10 produtos. Pe�a para o 
usu�rio digitar o pre�o desses 10 produtos, armazene esses valores no array criado. Posteriormente mostre o 
�ndice e pre�o do produto lado a lado. Pe�a ao usu�rio que escolha um �ndice. Depois pergunte qual a 
quantidade desse produto o usu�rio deseja comprar. Ent�o mostre o valor total a ser cobrado desse produto. 
Ao final, pergunte ao usu�rio se ele deseja comprar mais um produto (1 para SIM e 0 para N�O). Caso ele 
queira comprar, repita o processo de venda do produto
*/