package LoopExercise_2;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// Author: Jo�o V�tor Souza Pioner | Date: 11/06/2021
		Scanner sc = new Scanner(System.in);
		
		Integer answer = 0;
		do {
			System.out.print("Voc� deseja comprar um produto (1-sim, 2-nao)? ");
			answer = sc.nextInt();
			System.out.print("Voc� deseja ver a lista de produtos? ");
			answer = sc.nextInt();
			if (answer == 1) {
				System.out.println(showList());
			} 
			System.out.print("Insira o c�digo do produto: ");
			
			
		} while (answer != 2);
		
		
		sc.close();
	}
	
	public static String showList() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nC�digo: 123 | Nome: Balas | Pre�o: R$ 0,20\n");
		sb.append("C�digo: 124 | Nome: Barra de chocolate | Pre�o: R$ 2,50\n");
		sb.append("C�digo: 125 | Nome: Chicletes | Pre�o: R$ 0,25\n");
		sb.append("C�digo: 126 | Nome: Fandangos | Pre�o: R$ 4,00\n");
		sb.append("C�digo: 127 | Nome: Cafezinho | Pre�o: R$ 3,00\n");
		sb.append("C�digo: 128 | Nome: Doritos | Pre�o: R$ 4,50\n");
		sb.append("C�digo: 129 | Nome: �gua mineral | Pre�o: R$ 2,50\n");
		return sb.toString();

	}
}
