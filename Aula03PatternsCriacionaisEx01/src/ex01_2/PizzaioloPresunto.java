package ex01_2;

public class PizzaioloPresunto implements Pizzaiolo{
	
	public Pizza criarPizza() {
		return new PizzaPresunto();
	}
	
	public Calzone criarCalzone() {
		return new CalzonePresunto();
	}
	
}
