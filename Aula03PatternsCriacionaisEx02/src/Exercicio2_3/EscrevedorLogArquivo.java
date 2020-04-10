package Exercicio2_3;

public class EscrevedorLogArquivo extends EscrevedorLog {
	
	protected FerramentaLog criarFerramentaLog() {
		return new FerramentaLogArquivo();
	}
}