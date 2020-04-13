package EX09_2;

public class Handler {
	private Handler handler;
	private String nome;
	private long timer;
		
	public Handler(String nome) {
		super();
		this.nome = nome;
	}
	
	public void setHandler(Handler handler) {
		this.handler = handler;
	}
	
	public String getNome() {
		return nome;
	}	
	
	public void handleRequest() {
		long tempo = System.currentTimeMillis();
		long time = tempo - this.timer;
		
		if (time < 200) {
			System.out.println("O Handler "+nome+" esta ocupado. Enviando para o Handler "+this.handler.getNome());
			this.handler.handleRequest();
		}else if (this.handler != null) {
			this.timer = tempo;
			System.out.println("Handler "+nome+" processou.");
		} else System.out.println("Todos os handlers estao ocupados");
	}
}