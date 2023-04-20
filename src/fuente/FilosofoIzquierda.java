package fuente;

public class FilosofoIzquierda extends Thread{
	private int id;
	private Palillo izquierdo;
	private Palillo derecho;
	
	public FilosofoIzquierda(int id, Palillo izquierdo, Palillo derecho) {
		super();
		this.id = id;
		this.izquierdo = izquierdo;
		this.derecho = derecho;
	}
	
	public void run() {
		for(int i=0;1<3;i++) {
			System.out.println("Filósofo "+id+" esperando");
			izquierdo.reducir();
			System.out.println("Filósofo "+id+" obtuvo el palillo izquierdo");
			try {
				sleep(3000);
			}catch(InterruptedException e) {
				
			}
			System.out.println("Filósofo "+id+" esperando");
			derecho.reducir();
			System.out.println("Filósofo "+id+" obtuvo el palillo derecho");
			try {
				sleep(3000);
			}catch(InterruptedException e){
				
			}
			System.out.println("Filósofo "+id+" comiendo");
			try {
				sleep(3000);
			}catch(InterruptedException e){
				
			}
			System.out.println("Filósofo "+id+" dejó el palillo derecho");
			derecho.incrementar();
			try {
				sleep(3000);
			}catch(InterruptedException e){
				
			}
			System.out.println("Filósofo "+id+" dejó el palillo izquierdo");
			izquierdo.incrementar();
			try {
				sleep(3000);
			}catch(InterruptedException e){
				
			}
			System.out.println("Filósofo "+id+" durmiendo");
			try {
				sleep(3000);
			}catch(InterruptedException e){
				
			}
			System.out.println("Filósofo "+id+" pensando");
			try {
				sleep(3000);
			}catch(InterruptedException e){
				
			}
		}
	}
}
