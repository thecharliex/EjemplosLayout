package TestLayouts;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TestBoxLayout extends Ventana {
	private static final long serialVersionUID = 1L;

	public TestBoxLayout(String title, int width, int height) {
		super(title, width, height);
		Box horizontal1 = Box.createHorizontalBox();
		Box vertical1 = Box.createVerticalBox();
		Box horizontal2 = Box.createHorizontalBox();
		Box vertical2 = Box.createVerticalBox();
		
		final int TAMANIO = 3;
		
		// agrega botones al objetos horizontal1
		for(int i = 0; i < TAMANIO; i++) {
			horizontal1.add(new JButton("Button " + i));
		}
		
		// crea montante y agrega botones al objeto vertical1
		for(int i = 0; i < TAMANIO; i++) {
			vertical1.add(Box.createVerticalStrut(25));
			vertical1.add(new JButton("Button " + i));
		}
		
		// crea pegamento y agrega botones al objeto horizontal2
		for(int i = 0; i < TAMANIO; i++) {
			horizontal2.add(Box.createHorizontalGlue());
			horizontal2.add(new JButton("Button " + i));
		}
		
		// crea un area rigida y agrega botones al objeto vertical2
		for(int i = 0; i < TAMANIO; i++) {
			vertical2.add(Box.createRigidArea(new Dimension(12,8)));
			vertical2.add(new JButton("Button " + i));
		}
		
		// crea pegamento vertical y agrega botones al panel
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		// crea un area rigida y agrega botones al objeto vertical2
		for(int i = 0; i < TAMANIO; i++) {
			panel.add(Box.createGlue());
			panel.add(new JButton("Button " + i));
		}
		
		// crea un objeto JTabbedPane
		JTabbedPane fichas = new JTabbedPane(
				JTabbedPane.TOP,
				JTabbedPane.SCROLL_TAB_LAYOUT);
		
		// coloca cada contenedor en el panel con fichas
		fichas.add("Cuadro horizontal", horizontal1);
		fichas.add("Cuadro vertical con montantes", vertical1);
		fichas.add("Cuadro horizontal con pegamento", horizontal2);
		fichas.add("Cuadro con areas rigidas", vertical2);
		fichas.add("Cuadro con pegamento", panel);
		
		add(fichas);
	}

}
