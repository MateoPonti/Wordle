package vista;

import main.Eventos;
import wordle.modelo.Wordle;

public class Controlador implements AdministradorVista{
	Wordle modelo;
	
	public Controlador(Wordle modelo) {
		this.modelo=modelo;
	}

	@Override
	public void update(Eventos evento) {
		
		
	}
	
	

	
}
