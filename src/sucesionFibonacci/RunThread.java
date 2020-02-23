package sucesionFibonacci;

public class RunThread implements Runnable{

	private Thread t;
	private int posicion;
	private String titulo;
	
	RunThread(String titulo, int posicion){
		this.posicion = posicion;
		this.titulo = titulo;
		System.out.println("Creando: " + titulo + ".\n");	
		System.out.println(titulo + " creado.\n");
	}
	
	@Override
	public void run() {
		System.out.println("El número de la posición " + this.posicion + " es: " + Fibonacci.calculoFibonacci(this.posicion));
		
	}
	
	public void start() {
		System.out.println("Iniciando " + this.titulo + " para número: " + posicion + "\n");
		if(t == null) {
			t = new Thread(this, this.titulo);
			t.start();
		}
		
	}



	
}
