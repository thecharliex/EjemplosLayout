package Principal;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import TestLayouts.TestBorderLayout;
import TestLayouts.TestBoxLayout;
import TestLayouts.TestFlowLayout;
import TestLayouts.TestGridBagLayout;
import TestLayouts.TestGridLayout;
import TestLayouts.TestPanels;
import TestLayouts.TestPositions;

public class Principal extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JButton btn1 = new JButton("FlowLayout");
	JButton btn2 = new JButton("BorderLayout");
	JButton btn3 = new JButton("GridLayout");
	JButton btn4 = new JButton("JPanel");
	JButton btn5 = new JButton("BoxLayout");
	JButton btn6 = new JButton("GridBangLayout");
	JButton btn7 = new JButton("TestPosition");
	
	public Principal() {
		super("Ejemplos de layouts");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 400);
		this.setVisible(true);
		Container container = this.getContentPane();
		container.setLayout(new FlowLayout());
		this.addButtons(container);
		this.pack();
	}

	private void addButtons(Container container) {		
		btn1.setToolTipText("Coloca los componentes secuencialmente de derecha a izquierda" +
				"de forma secuencial en el orden en que se agregaron.");
		
		btn2.setToolTipText("Ordena los componentes en cinco areas " +
				"NORTH, SOUTH, EAST, WEST y CENTER");
		
		btn3.setToolTipText("Ordena los componentes en FILAS y COLUMNAS");
		
		btn4.setToolTipText("Demostracion de panel para administrad esquemas complejos");
		btn5.setToolTipText("Ordena los componentes de izquierda a derecha o de arriba a abajo");
		
		btn1.addActionListener(new EventsManager());
		btn2.addActionListener(new EventsManager());
		btn3.addActionListener(new EventsManager());
		btn4.addActionListener(new EventsManager());
		btn5.addActionListener(new EventsManager());
		btn6.addActionListener(new EventsManager());
		btn7.addActionListener(new EventsManager());
		
		container.add(btn1);
		container.add(btn2);
		container.add(btn3);
		container.add(btn4);
		container.add(btn5);
		container.add(btn6);
		container.add(btn7);
		
	}

	public static void main(String[] args) {
		new Principal();
	}
	
	private class EventsManager implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent evento) {
			if(btn1 == evento.getSource()) {
				new TestFlowLayout("TestFlorLayout", 500, 400);
			} else if(btn2 == evento.getSource()) {
				new TestBorderLayout("TestBorderLayout", 500, 400);
			} else if(btn3 == evento.getSource()) {
				new TestGridLayout("TestGridLayout", 500, 400);
			} else if(btn4 == evento.getSource()) {
				new TestPanels("Test panel", 500, 400);
			} else if(btn5 == evento.getSource()) {
				new TestBoxLayout("Test panel", 400, 220);
			} else if(btn6 == evento.getSource()) {
				new TestGridBagLayout("GridBangLayout", 300, 150);
			} else if(btn7 == evento.getSource()) {
				new TestPositions("Posiciones", 500, 400);
			}
		}
	} 
}
