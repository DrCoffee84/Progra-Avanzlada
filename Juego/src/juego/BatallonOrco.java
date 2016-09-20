package juego;

import java.util.LinkedList;

public class BatallonOrco extends Batallon {

	public BatallonOrco(int cant) {
		super(cant);
		batallon =  new LinkedList<Personaje>();
		
		for (int i = 0; i < cant; i++) {
			batallon.add( new Orco() );
		}	
	}

	public void atacar(Batallon victimas){
		int I = 0; //  "macro", esto luego podria llegar de parametro si quiero selecionar a alguno en especial.
	//	System.out.println("�ORCOS ATACA!");
		for (Personaje Orco: batallon) {
			Personaje victima = victimas.batallon.get(I); //Seleciono el primero
			Orco.atacar( victima ); //Ataco a la victima
			victimas.serAtacado( victima );		//Al atacar al batallon le envio la victima, para ver si lo descuento.
		}
	}
}