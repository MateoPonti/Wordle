package vistaswing.vista;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class VistaPrincipal extends JFrame{

	public VistaPrincipal() {
		
		JPanel panelPrincipal= (JPanel) getContentPane();
		panelPrincipal.setLayout(new FlowLayout());
	}
}
