package Exercicio4_1;

import java.util.Iterator;
import java.util.Map;

public class MapTest {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		Object[][] pares = new String[][] { { "Escola", "Empresa", "Mercado", "Lanchonete", "Processador" }, { "Alunos", "Funcionários", "Produtos", "Lanches", "Núcleo" } };

		Map mapaH = new HashMapAdapter(pares);

        System.out.println("HashMap:");
		for (Iterator it = mapaH.entrySet().iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println(entry.getKey() + " -- " + entry.getValue());
	}
		
		
		Map mapaT = new TreeMapAdapter(pares);
		System.out.println("\nTreemap:");
		for (Iterator it = mapaT.entrySet().iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}
	}
}