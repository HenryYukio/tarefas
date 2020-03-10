package AtividadeBonato01;

import java.util.ArrayList;

public class Geometria {
	
	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<Figura>();
		figuras.add(new Circulo(5.0));
		figuras.add(new Retangulo(5,10));
		figuras.add(new Quadrado(10));
		figuras.add(new Triangulo(3,3,3));
		figuras.add(new Losango(7,3,5));
		for(Figura figura: figuras) {
			System.out.println("**********************************************");
			System.out.println(figura);
			System.out.println("Área = "+figura.area());
			if (figura instanceof Diagonal) {
				Diagonal d = (Diagonal)figura;
				System.out.println("Diagonal = "+d.diagonal());
			}
		}
	}

}