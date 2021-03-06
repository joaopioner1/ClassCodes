package projeto_integrador;

import java.util.Scanner;

public class VerificaRespotas {

	Scanner input = new Scanner(System.in);

	private char resposta;
	private char continuar;

	public char getContinuar() {
		return continuar;
	}

	public void setContinuar(char continuar) {
		this.continuar = continuar;
	}

	public char getResposta() {
		return resposta;
	}

	public void setResposta(char resposta) {
		this.resposta = resposta;
	}
	
	/*public void () {
		
	}*/
	
	public void verificaPeriferico() {

		do {
			System.out.println("O dispositivo � um perif�rico (s/n)?");
			this.setResposta(input.next().charAt(0));

			if (this.getResposta() == 's') {
				System.out.println("Ele movimenta o cursor pela tela do computador (s/n)?");
				this.setResposta(input.next().charAt(0));

				if (this.getResposta() == 's') {
					System.out.println("Ele se chama 'rato'?");
					this.setResposta(input.next().charAt(0));

					if (this.getResposta() == 's') {
						System.out.println("O dispositvo � um MOUSE! Deseja continuar jogando (s/n)?");
						this.setContinuar(input.next().charAt(0));
					}
				}
			} else if (this.getResposta() == 'n') {
				System.out.println("Voc� enxerga coisas atrav�s dele (s/n)?");
				this.setResposta(input.next().charAt(0));
				
				if (this.getResposta() == 's') {
					System.out.println("O dispositvo � um MONITOR! Deseja continuar jogando (s/n)?");
					this.setContinuar(input.next().charAt(0));
				}
			} else if (this.getResposta() == 'n') {
				System.out.println("Voc� utiliza-o para digitar (s/n)?");
				this.setResposta(input.next().charAt(0));
				
				if (this.getResposta() == 's') {
					System.out.println("O dispositvo � um TECLADO! Deseja continuar jogando (s/n)?");
					this.setContinuar(input.next().charAt(0));
				}
			}
		} while (this.getContinuar() == 's');
	}
}
