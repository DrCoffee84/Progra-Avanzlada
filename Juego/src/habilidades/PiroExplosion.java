package habilidades;

import personaje.Personaje;

public class PiroExplosion extends Habilidad {
	
	public PiroExplosion(){
		this.costo = 35;
		this.ataqueBasico = 20;
	}
	@Override
	public void afectar(Personaje victima) {
		victima.serAtacado(ataqueBasico);
	}

}
