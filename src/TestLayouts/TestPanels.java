package TestLayouts;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class TestPanels extends Ventana {
	private static final long serialVersionUID = 1L;
	
	private Container container = this.getContentPane();
	private JPanel jPanel = new JPanel();
	private JButton[] button = new JButton[5];
	private BorderLayout borderLayout = new BorderLayout();
	EventsManager eventsManager = new EventsManager();

	public TestPanels(String title, int width, int height) {
		super(title, width, height);
		jPanel.setLayout(new GridLayout(1, button.length));
		
		for(int i = 0; i < button.length; i++) {
			button[i] = new JButton("Btn = " + i);
			button[i].addActionListener(eventsManager);
			jPanel.add(button[i]);
		}
		
		button[0].setText("NORTH");
		button[1].setText("SOUTH");
		button[2].setText("EAST");
		button[3].setText("WEST");
		button[4].setText("CENTER");
		
		container.setLayout(borderLayout);
		container.add(jPanel, BorderLayout.SOUTH);
	}
	
	private class EventsManager implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent evento) {
			if(button[0] == evento.getSource()) {
				container.add(jPanel, BorderLayout.NORTH);
				container.validate();
			} else if(button[0] == evento.getSource()) {}
			if(button[1] == evento.getSource()) {
				container.add(jPanel, BorderLayout.SOUTH);
				container.validate();
			}
			if(button[2] == evento.getSource()) {
				container.add(jPanel, BorderLayout.EAST);
				container.validate();
			}
			if(button[3] == evento.getSource()) {
				container.add(jPanel, BorderLayout.WEST);
				container.validate();
			}
			if(button[4] == evento.getSource()) {
				container.add(jPanel, BorderLayout.CENTER);
				container.validate();
			}
			
		}
	} 
}
