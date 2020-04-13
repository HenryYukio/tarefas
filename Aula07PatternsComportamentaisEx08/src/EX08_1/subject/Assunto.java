package EX08_1.subject;

import EX08_1.observer.ConsomeNoticia;

public interface Assunto {
	void registraObservador(ConsomeNoticia observer);
	void removeObservador(ConsomeNoticia observer);
	void notificaTodos();

}
