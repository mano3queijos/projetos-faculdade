package recursividade;

public class Fatorial {
	public static void main(String[] args) {
		Fatorial r = new Fatorial();
		
		int resp = r.fatorial(4);
		System.out.println(resp);

	}

	public int fatorial(int x) {
		// Caso Base: Se x for igual a 0 (zero) então retorna 1.
		System.out.println(x);

		if (x == 0)
			return 1;
		/*
		 * Para qualquer outro número, calcula o seu valor multiplicado pelo fatorial de
		 * seu antecessor.
		 */
		return x * fatorial(x - 1);
		
		
	}

}