package EX6_2;

import javax.swing.JOptionPane;

public class Teste {
	
	private static int a = 10;
	private static int numero = 14000;
	
	
	private static int[] organizandoNumeros() {
		int[] b = new int[a];
		for (int i = 0; i < b.length; i++)
		b[i] = (int) (Math.random() * numero);
		System.out.println("-------Imprimindo Números Aleatóriamente--------\n");
	return b;
	
	}

	private static void imprimirNumeros(int c[]) {
		for (int i = 0; i < c.length; i++)
		System.out.println(c[i]);
		System.out.println("-------Imprimindo Números Ordenados--------\n");
		
	}

	public static void main(String args[]) {
		
				
		int[] num;
		Ordenacao ord;
		
		num = organizandoNumeros();
		imprimirNumeros(num);
		String strategy = JOptionPane.showInputDialog("Escolha uma das seguintes ordenações:\nBubbleSort\nInsertionSort\nSelectionSort\nQuickSort");
		
		
			if("BubbleSort".equals(strategy)) {
				ord = new BubbleSort();
				ord.ordena(num);
				imprimirNumeros(num);
			}
			
			else if ("InsertionSort".equals(strategy)) {
				ord = new InsertionSort();
				ord.ordena(num);
				imprimirNumeros(num);
			}
			
			else if ("SelectionSort".equals(strategy)) {
				ord = new SelectionSort();
				ord.ordena(num);
				imprimirNumeros(num);
			}
			
			else if ("QuickSort".equals(strategy)) {
				ord = new QuickSort();
				ord.ordena(num);
				imprimirNumeros(num);
			}
			
			else System.out.println("Escolha uma das quatro ordenações!");
				
				
		}
	
	}
