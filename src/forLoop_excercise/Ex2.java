package forLoop_excercise;

public class Ex2 {
	
	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner | Date: 08/06/2021 14:23
		try {
			for (int i = -10; i >= -100; i--) {
				System.out.println(i);
			}
		} 
		catch (NullPointerException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}
}
//2. Fa�a um programa em Java que imprime na tela em sequ�ncia todos os n�meros de -10 � -100.
