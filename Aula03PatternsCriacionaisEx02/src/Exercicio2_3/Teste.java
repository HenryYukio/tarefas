package Exercicio2_3;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		String metodo = JOptionPane.showInputDialog(null, "arquivo ou console?");
		if("arquivo".equals(metodo)) {
			EscrevedorLog log = new EscrevedorLogArquivo();
			
			for (int i = 1; i <= 10; i++)
				log.escreverLog("Contando: " + i);
		} else if ("console".equals(metodo)) {
			EscrevedorLog log = new EscrevedorLogConsole();
			
			for (int i = 1; i <= 10; i++)
				log.escreverLog("Contando: " + i);
		} else {
			System.out.println("Erro, digite 'arquivo' ou 'console'");
		System.exit(0);
		}
    }
}