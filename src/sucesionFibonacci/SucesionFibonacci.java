package sucesionFibonacci;

import pideDatos.PideDatos;

public class SucesionFibonacci {

	public static void main(String[] args) {
		System.out.println("Bienvenido a la calculadora de la sucesión de Fibonacci. \n");
		System.out.println("A continuación debe introducir 4 numeros sobre los cuales calcularemos la sucesión de Fibonacci. \n");
		
		int num1 = PideDatos.pideEntero("Introduzca el primer número");
		int num2 = PideDatos.pideEntero("Introduzca el segundo número");
		int num3 = PideDatos.pideEntero("Introduzca el tercer número");
		int num4 = PideDatos.pideEntero("Introduzca el cuarto número");
		
		
	}

}
