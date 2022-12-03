package vistaswing.vista;

import vista.IVista;

public class VistaConsolaSwing implements IVista{
	VistaPrincipal vPrincipal;
	
	
	public VistaConsolaSwing() {
		vPrincipal= new VistaPrincipal();
	}
	
	@Override
	public void inicializar() {
		vPrincipal.setVisible(true);
	}

}
