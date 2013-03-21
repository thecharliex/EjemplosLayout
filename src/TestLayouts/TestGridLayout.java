package TestLayouts;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TestGridLayout extends Ventana {
	private static final long serialVersionUID = 1L;
	
	Container container = this.getContentPane();
	EventsManager manejador = new EventsManager();
	GridLayout gridLayout1 = new GridLayout(3,2,5,5);
	GridLayout gridLayout2 = new GridLayout(2,3);
	
	private boolean alternar = true;
	
	EventsManager eventsManager = new EventsManager();
	JButton[] button = new JButton[6];

	public TestGridLayout(String title, int width, int height) {
		super(title, width, height);
		
		container.setLayout(gridLayout1);
		
		for(int i = 0; i < 6; i++) {
			button[i] = new JButton("Btn = " + i);
			button[i].addActionListener(manejador);
			container.add(button[i]);
		}
	}
	
	private class EventsManager implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(alternar) {
				container.setLayout(gridLayout2);
				alternar = false;
			} else {
				container.setLayout(gridLayout1);
				alternar = true;
			}
			
			container.validate();
		}
		
	}

}
