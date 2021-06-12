package LoopExercise_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// Author: Jo�o V�tor Souza Pioner | Date: 11/06/2021
		Scanner sc = new Scanner(System.in);

		List<Double> list = new ArrayList<Double>();

		Double result = 0.0;
		Integer answer = 0, cont = 0, quantity = 0;
		do {
			System.out.print("Voc� deseja comprar um produto (1-sim, 2-nao)? ");
			cont = sc.nextInt();
			if (cont == 1) {
				System.out.print("Insira o c�digo do produto: ");
				answer = sc.nextInt();
				switch (answer) {
				case 123:
					System.out.print("Insira a quantidade do produto: ");
					quantity = sc.nextInt();
					result = quantity * 0.20;
					list.add(result);
					break;
				case 124:
					System.out.print("Insira a quantidade do produto: ");
					quantity = sc.nextInt();
					result = quantity * 2.50;
					list.add(result);
					break;
				case 125:
					System.out.print("Insira a quantidade do produto: ");
					quantity = sc.nextInt();
					result = quantity * 0.25;
					list.add(result);
					break;
				case 126:
					System.out.print("Insira a quantidade do produto: ");
					quantity = sc.nextInt();
					result = quantity * 4.00;
					list.add(result);
					break;
				case 127:
					System.out.print("Insira a quantidade do produto: ");
					quantity = sc.nextInt();
					result = quantity * 4.50;
					list.add(result);
					break;
				case 128:
					System.out.print("Insira a quantidade do produto: ");
					quantity = sc.nextInt();
					result = quantity * 3.00;
					list.add(result);
					break;
				case 129:
					System.out.print("Insira a quantidade do produto: ");
					quantity = sc.nextInt();
					result = quantity * 2.50;
					list.add(result);
					break;
				}
			} else if (cont == 2) {
				System.out.println("Ok, boa semana!");
			} else {
				throw new InvalidNumberEntered("Escreveu n�mero errado. Digite 1/2");
			}

			System.out.print("Voc� deseja ver a lista de produtos (1-sim 2-nao)? ");
			answer = sc.nextInt();
			if (answer == 1) {
				System.out.println(showList());
			}

		} while (cont != 2);

		System.out.println("\nTamanho da lista: " + list.size());
		Double i = 0.0;
		for (Double aux : list) {
			i += aux;
		}
		System.out.println("Valor total gasto: R$ " + String.format("%.2f", i));
		
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
