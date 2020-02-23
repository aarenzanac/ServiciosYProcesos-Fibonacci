package sucesionFibonacci;

public class Fibonacci {

	public static int sucesionFibonacci(int posicion) {
		int resultado = 0;
		for (int i = 0; i <= posicion; i++) {
			resultado = calculoFibonacci(i);
		}
		return resultado;
	}

	public static int calculoFibonacci(int numero) {
		if (numero <= 0) {
			return 0;
		} else if (numero == 1) {
			return 1;
		} else {
			return (calculoFibonacci(numero-1) + calculoFibonacci(numero-2));
		}

	}
}
