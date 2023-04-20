package fuente;

public class FilosofosComenzales {

	public static void main(String[] args) {
		Palillo palillo1=new Palillo();
		Palillo palillo2=new Palillo();
		Palillo palillo3=new Palillo();
		Palillo palillo4=new Palillo();
		Palillo palillo5=new Palillo();
		
		FilosofoIzquierda f1=new FilosofoIzquierda(1, palillo2, palillo1);
		FilosofoDerecha f2=new FilosofoDerecha(2, palillo3, palillo2);
		FilosofoIzquierda f3=new FilosofoIzquierda(3, palillo4, palillo3);
		FilosofoDerecha f4=new FilosofoDerecha(2, palillo5, palillo4);
		FilosofoIzquierda f5=new FilosofoIzquierda(1, palillo1, palillo5);
		
		f1.start();
		f2.start();
		f3.start();
		f4.start();
		f5.start();
	}

}
