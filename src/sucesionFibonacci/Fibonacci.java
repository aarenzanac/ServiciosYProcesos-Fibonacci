package sucesionFibonacci;

public class Fibonacci {
	
	public static int calculoFibonacci(int numero) {
		int resultado = 0;
		
		for(int i = 2; i < numero; i++){
			
			resultado = (i-1) + (i-2);
			calculoFibonacci(resultado);
		}
		
		
		return resultado;
	}
}
