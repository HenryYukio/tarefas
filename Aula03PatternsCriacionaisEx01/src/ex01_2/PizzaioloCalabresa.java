package ex01_2;

public class PizzaioloCalabresa implements Pizzaiolo {
	
	public Pizza criarPizza() {
		return new PizzaCalabresa();
	}
	
	public Calzone criarCalzone() {
		return new CalzoneCalabresa();
	}
	

}
