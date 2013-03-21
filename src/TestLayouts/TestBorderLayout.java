package TestLayouts;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TestBorderLayout extends Ventana {
	private static final long serialVersionUID = 1L;
	
	Container container = this.getContentPane();
	BorderLayout borderLayout = new BorderLayout();
	EventsManager eventsManager = new EventsManager();
	
	JButton[] button = new JButton[5];
	
	public TestBorderLayout(String title, int width, int height) {
		super(title, width, height);
		
		container.setLayout(borderLayout);
		
		for(int i = 0; i < 5; i++) {
			button[i] = new JButton();
			button[i].addActionListener(eventsManager);
		}
		
		button[0].setText("hide NORTH");
		button[1].setText("hide SOUTH");
		button[2].setText("hide EAST");
		button[3].setText("hide WEST");
		button[4].setText("hide CENTER");
		
		container.add(button[0], BorderLayout.NORTH);
		container.add(button[1], BorderLayout.SOUTH);
		container.add(button[2], BorderLayout.EAST);
		container.add(button[3], BorderLayout.WEST);
		container.add(button[4], BorderLayout.CENTER);
	}
	
	private class EventsManager implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(button[0] == e.getSource()) {
				button[0].setVisible(false);
			} else if(button[1] == e.getSource()) {
				button[1].setVisible(false);
			} else if(button[2] == e.getSource()) {
				button[2].setVisible(false);
			} else if(button[3] == e.getSource()) {
				button[3].setVisible(false);
			} else if(button[4] == e.getSource()) {
				button[4].setVisible(false);
			}
			
		}
	};

}
