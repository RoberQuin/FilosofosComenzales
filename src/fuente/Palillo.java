package fuente;

public class Palillo {
	private int valor=1;
	
	public Palillo() {
		valor=1;
	}
	
	synchronized void reducir() {
		while (valor<=0) {
			try {
				wait();
			}catch(InterruptedException e) {
				
			}
		}
		valor--;
	}
	
	synchronized void incrementar() {
		valor++;
		notify();
	}
	
	public int getValor() {
		return valor;
	}
}
