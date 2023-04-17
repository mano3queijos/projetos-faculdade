package br.com.ucsal.edu.estruuradados.emanuelAP.fila_circular_dinamica;

public class FilaCircularDinâmica {

	NoFilaCircular inicio;
	NoFilaCircular fim;

	public FilaCircularDinâmica() {
		// TODO Auto-generated constructor stub
	}

	public void adicionarFila(int dado) {
		NoFilaCircular novo = new NoFilaCircular(dado);
		if (vazia()) {
			inicio = novo;
			fim = novo;
			fim.proximo = inicio;
		} else {
			novo.proximo = inicio;
			fim.proximo = novo;
			fim = novo;
		}
	}

	public boolean vazia() {
		return inicio == null && fim == null;
	}

	public int removerFila() {
		int removido;
		if (vazia()) {
			removido = -1;
		} else if (inicio == fim) {
			removido = inicio.dado;
			inicio = null;
			fim = null;
		} else {
			removido = inicio.dado;
			fim = inicio;
			inicio = inicio.proximo;
			fim.proximo = inicio;
		}
		return removido;
	}

	public String toString() {
		String listados = "Numeros" + "\n";
		int numero = 1;
		if (vazia()) {
			return listados = "Não foi possivel encontrar valores cadastrados";
		} else if (inicio == fim) {
			listados = listados + numero + " - " + inicio.dado;
		} else {
			NoFilaCircular aux = inicio;
			if (aux == fim.proximo) {
				listados = listados + numero + " - " + aux.dado + "\n";
				aux = aux.proximo;
				numero++;
			}
			while (aux != fim.proximo) {
				listados = listados + numero + " - " + aux.dado + "\n";
				aux = aux.proximo;
				numero++;
			}
		}
		return listados;
	}

}
