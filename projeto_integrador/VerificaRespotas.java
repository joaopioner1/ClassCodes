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

	public void verificaPeriferico() {
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
			if (this.getResposta() == 'n') {
				System.out.println("Voc� enxerga coisas atrav�s dele (s/n)?");
				this.setResposta(input.next().charAt(0));

				if (this.getResposta() == 's') {
					System.out.println("O dispositvo � um MONITOR! Deseja continuar jogando (s/n)?");
					this.setContinuar(input.next().charAt(0));
				}
			}
			if (this.getResposta() == 'n') {
				System.out.println("Voc� utiliza-o para digitar (s/n)?");
				this.setResposta(input.next().charAt(0));

				if (this.getResposta() == 's') {
					System.out.println("O dispositvo � um TECLADO! Deseja continuar jogando (s/n)?");
					this.setContinuar(input.next().charAt(0));
				}
				if (this.getResposta() == 'n') {
					System.out.println("Ele � importante para v�deo chamadas (s/n)?");
					this.setResposta(input.next().charAt(0));

					if (this.getResposta() == 's') {
						System.out.println("Ele � capaz de tirar fotos e gravar v�deos (s/n)?");
						this.setResposta(input.next().charAt(0));

						if (this.getResposta() == 's') {
							System.out.println("O dispositvo � uma WEBCAM! Deseja continuar jogando (s/n)?");
							this.setContinuar(input.next().charAt(0));
						} else {
							System.out.println("Estou confuso... Deseja continuar tentando (s/n)?");
							this.setContinuar(input.next().charAt(0));
						}
					}
				}
			}
		}
	}

	public void verificaMemoria() {
		System.out.println("� um tipo de mem�ria (s/n)?");
		this.setResposta(input.next().charAt(0));

		if (this.getResposta() == 's') {
			System.out.println("Ap�s o desligamento do computador os dados permancem (s/n)?");
			this.setResposta(input.next().charAt(0));

			if (this.getResposta() == 's') {
				System.out.println("Ela(e) tem processamento mais lento quando comparado(a) ao SSD (s/n)?");
				this.setResposta(input.next().charAt(0));

				if (this.getResposta() == 's') {
					System.out.println("Utiliza um disco magn�tico para armazenar os arquivos (s/n)?");
					this.setResposta(input.next().charAt(0));

					if (this.getResposta() == 's') {
						System.out.println("� um HD (hard disk)! Deseja continuar jogando (s/n)?");
						this.setContinuar(input.next().charAt(0));
					} else {
						System.out.println("Estou confuso... Deseja continuar tentando (s/n)?");
						this.setContinuar(input.next().charAt(0));
					}
				} else {
					System.out.println("� um tipo de mem�ria n�o vol�til (s/n)?");
					this.setResposta(input.next().charAt(0));

					if (this.getResposta() == 's') {
						System.out.println("Utiliza chips para armazenar dados (s/n)?");
						this.setResposta(input.next().charAt(0));
					}
					if (this.getResposta() == 's') {
						System.out.println("S�o mais velozes que HDs (s/n)?");
						this.setResposta(input.next().charAt(0));

						if (this.getResposta() == 's') {
							System.out.println("� o SDD (Solid States Drives)! Deseja continuar jogando (s/n)?");
							this.setContinuar(input.next().charAt(0));
						}
					}
				}
			} else {
				System.out.println("Voc� pode expandir este tipo de mem�ria (s/n)?");
				this.setResposta(input.next().charAt(0));

				if (this.getResposta() == 's') {
					System.out.println("Ela perde seus dados se n�o houver energia el�trica, isto �, uma mem�ria vol�til (s/n)?");
					this.setResposta(input.next().charAt(0));

					if (this.getResposta() == 's') {
						System.out.println("� a mem�ria RAM! Deseja continuar jogando (s/n)?");
						this.setContinuar(input.next().charAt(0));
					}
				} else {
					System.out.println("Estou confuso... Deseja continuar tentando (s/n)?");
					this.setContinuar(input.next().charAt(0));
				}
			}
		}
	}
	
	public void hardwaresAuxiliares() { // - Ele resfria o hardware? Ele � uma esp�cie de ventilador?	� importante limpa-lo?
		System.out.println("Este aparelho resfria o hardware (s/n)?");
		this.setResposta(input.next().charAt(0));
		
		if (this.getResposta() == 's') {
			System.out.println("� uma esp�cie de ventilador (s/n)?");
			this.setResposta(input.next().charAt(0));
			
			if (this.getResposta() == 's') {
				System.out.println("� importante limpa-lo (s/n)?");
				this.setResposta(input.next().charAt(0));
				
				if (this.getResposta() == 's') {
					System.out.println("� o COOLER! Deseja continuar jogando (s/n)?");
					this.setContinuar(input.next().charAt(0));
				}
			}
		} else {
			System.out.println("A fun��o ");
		}
	}

	public void verificaRespostas() {
		do {
			
			this.verificaPeriferico();
			this.verificaMemoria();
			

		} while (this.getContinuar() == 's');
	}
}