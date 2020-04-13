package ex07_1;

public class Teste {
	
		public static void main(String[] args) throws Exception {
			
			ManipuladorAbstrato manipulador;
			
			System.out.println("---------------------");
			System.out.println("Transforma em maiúsculo\n");
			manipulador = new ManipuladorMaiusculo();
			manipulador.manipularString();
			
			System.out.println("---------------------");
			System.out.println("Transforma em minúsculo\n ");
			manipulador = new ManipuladorMinusculo();
			manipulador.manipularString();
			
			System.out.println("---------------------");
			System.out.println("Duplica\n");	
			manipulador = new ManipuladorDuplicar();
			manipulador.manipularString();

			System.out.println("---------------------");
			System.out.println("Inverte\n");
			manipulador = new ManipuladorInverter();
			manipulador.manipularString();
		}
}
