package exercicios3_modulo2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// Author: Jo�o V�tor Souza Pioner | Date: 23/02/2021
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira a idade do nadador: ");
		int age = input.nextInt();
		
		if (age >= 5 && age <= 7) {
			System.out.println("Categoria infantil A! Cuidado para n�o se afogar.");
		} else if (age >= 8 && age <= 10) {
			System.out.println("Categoria infantil B! Cuidado, pequenino.");
		} else if (age >= 11 && age <= 13) {
			System.out.println("Categoria juvenil A! Preste aten��o.");
		} else if (age >= 14 && age <= 17) {
			System.out.println("Categoria juvenil B! N�o confie demais em si mesmo.");
		} else if (age >= 18) {
			System.out.println("Categoria adulta! Seja respons�vel.");
		} else {
			System.out.println("Idade n�o v�lida.");
		}
		
		input.close();
	}

}
/*Elabore um programador que dada a idade de um nadador classifique-o em uma das seguintes
categorias. Mostrar na tela a idade e a categoria digitada pelo usu�rio:
Infantil A = 5 a 7 anos
Infantil B = 8 a 10 anos
Juvenil A = 11 a 13 anos
Juvenil B = 14 a 17 anos
Adulto = maiores de 18 anos*/