package EX08_1.subject;

import java.util.ArrayList;

import EX08_1.observer.ConsomeNoticia;

public class FonteNoticias implements Assunto {
	private ArrayList<ConsomeNoticia> observadores;
	private Noticia noticia;
	
	public FonteNoticias() {
		this.observadores = new ArrayList<>();
	}
	
	@Override
	public void registraObservador(ConsomeNoticia observer) {
		observadores.add(observer);
	}

	@Override
	public void removeObservador(ConsomeNoticia observer) {
		observadores.remove(observer);
	}

	@Override
	public void notificaTodos() {
		for(ConsomeNoticia observer:observadores) {
			observer.consomeNoticia(noticia.getTexto(), noticia.getDia(), 
					noticia.getMes(), noticia.getTopico());
		}
	}

	public Noticia getNoticia() {
		return noticia;
	}

	public void setNoticia(Noticia noticia) {
		this.noticia = noticia;
		this.notificaTodos();
	}

}
