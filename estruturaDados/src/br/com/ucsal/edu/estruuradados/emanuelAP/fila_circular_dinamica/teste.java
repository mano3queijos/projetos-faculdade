package br.com.ucsal.edu.estruuradados.emanuelAP.fila_circular_dinamica;

public class teste {

	public static void main(String[] args) {

		FilaCircularDinâmica fcd = new FilaCircularDinâmica();

		int itemA = 12;
		int itemB = 1;
		int itemG = 12;
		int itemD = 12;
		int itemL = 12;
		int itemW = 12;
		int itemS = 12;
		fcd.adicionarFila(1);
		fcd.adicionarFila(2);
		fcd.adicionarFila(3);
		fcd.adicionarFila(4);

		System.out.println(fcd.toString());
	}
}
