package projeto_integrador;

public class MainClass_JogoAdivinhacao {

	public static void main(String[] args) {
		// Autor: Jo�o V�tor Souza Pioner e Juliano de Lima | Data: 01/03/2021

		/*
		 * Este game � um projeto integrador o qual envolve a disciplina de programa��o e Introdu��o a info.
		 * O jogo se parece com o Akinator, por�m � uma vers�o "did�tica" do mesmo. Aqui, voc� ir� escolher (mentalmente) 
		 * uma pe�a aleat�ria de computador e, se assim desejar, tentar ach�-la digitando apenas SIM ou N�O para �s 
		 * quest�es que ir�o ser mostradas em sua tela (console).
		 * 
		 * Respostas(pe�as) disponive�s: mouse, monitor, teclado, mem�ria RAM, HD, Placa
		 * m�e, estabilizador, cooler, WebCam, processador, SSD, Placa de v�deo.
		 * 
		 * Aproveite a jogatina!
		 */
		
		VerificaRespotas vf = new VerificaRespotas(); //Instanciei a classe
		
		vf.verificaRespostas(); //M�todo que executa o game
		
	}
}
