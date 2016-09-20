package juegoTest;
import org.junit.Test;

import juego.Batallon;
import juego.BatallonHumano;
import juego.BatallonOrco;
import junit.framework.Assert;


public class BatallonTest {
	@Test
	public void batallaGanaHumano(){
		Batallon b_Humano = new BatallonHumano(15);
		Batallon b_Orco = new BatallonOrco(10);
		int i = 1; 
		String ganador = "";
		boolean fin = false;
		System.out.println("�Empieza la batalla!");
		
		while( !fin ){
			System.out.println("Round "+i);
			
			b_Humano.atacar(b_Orco);
			b_Orco.atacar(b_Humano);
			
			if( b_Humano.isEmpty() ){
				fin = true;
				ganador = "ORDA";
			}
			if( b_Orco.isEmpty() ){
				fin = true;
				ganador = "ALIANZA";
			}
			i++;
		}
		System.out.println("El ganador es:"+ganador);
	}
}
