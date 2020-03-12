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
		figuras.add(new Trapezio(8,4,5,0));
		figuras.add(new Cubo(5,3,2));
		figuras.add(new Piramide(2,3,5,10));
		figuras.add(new Cilindro(2,3));
		figuras.add(new Esfera(2,4));
		for(Figura figura: figuras) {
			System.out.println("**********************************************");
			System.out.println(figura);
			System.out.println("Área = "+figura.area());
			System.out.println("Perimetro = "+figura.perimetro());
			if (figura instanceof Diagonal) {
				Diagonal d = (Diagonal)figura;
				System.out.println("Diagonal = "+d.diagonal());
			}
			if (figura instanceof Volume) {
				Volume v = (Volume)figura;
				System.out.println("Volume = "+v.volume());
			}
		}
	}

}
