package TestLayouts;

import javax.swing.JFrame;

public class Ventana extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public Ventana(String title, int width, int height) {
		super("Ejemplos de layouts");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(width, height);
		this.setVisible(true);
		
		//this.pack();
	}
}
