package recursividade;

import java.util.Scanner;

public class Fibonacci {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Informe até que posição deseja ");
		int resp = scan.nextInt();
		Fibonacci x = new Fibonacci();
		x.sequencia(resp);

	}

	static long fibonacci(int x) {

		return (x < 2) ? x : fibonacci(x - 1) + fibonacci(x - 2);

	}

	public void sequencia(int x) {
		for (int i = 0; i < x; i++) {
			System.out.print("(" + i + "):" + Fibonacci.fibonacci(i) + "\t");

		}

	}

}