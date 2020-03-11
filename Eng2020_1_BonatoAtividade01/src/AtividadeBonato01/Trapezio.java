package AtividadeBonato01;

public class Trapezio extends Poligono {
private double base_menor;
private double lado;
	
	public Trapezio(double base, double altura, double base_menor, double lado) {
		super(base, altura);
		this.base_menor = base_menor;
		this.lado = lado;
	}
	
	public double getBase_menor() {
		return base_menor;
	}

	public void setBase_menor(double base_menor) {
		this.base_menor = base_menor;
	}

	public double getLado() {
		return Math.sqrt((getAltura()*getAltura()) + Math.pow(getBase()-getBase_menor(),2));
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	

	@Override
	public double area() {	
		return ((getBase()+getBase_menor())* getAltura()/2) ;
	}

	@Override
	public double perimetro() {		
		return getBase() + getBase_menor() + getLado() + getLado()  ;
	}
	@Override
	public String toString() {
		return "Trapezio [Base=" + getBase() + ", Altura=" + getAltura() + ", Base menor" + getBase_menor()+ ", Lado=" + getLado() +"]";
	}
	
}