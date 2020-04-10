package EX3_1;

public class Incremental {
	
	private static Incremental inc =  new Incremental();
	private static int count = 0;
	private int numero;
	
	public Incremental() {
		numero = ++count;
		}
	
	public static Incremental getInstance() {
		return inc;
	}
	
	public String toString() {
		return "Incremental " + numero;
		}
	}


