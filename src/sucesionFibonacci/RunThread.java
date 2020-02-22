package sucesionFibonacci;

public class RunThread implements Runnable{

	private Thread t;
	
	RunThread(int numero){
		System.out.println("Creando hilo...");
		t = new Thread(this);
		
		
	}
	
	@Override
	public void run() {
		
		
	}

}
