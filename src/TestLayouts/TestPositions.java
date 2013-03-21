package TestLayouts;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TestPositions extends Ventana {
	private static final long serialVersionUID = 1L;
	EventManager manager = new EventManager();
	JButton button;
	JTextField TextField;
	JLabel label;

	public TestPositions(String title, int width, int height) {
		super(title, width, height);
		
		this.setLayout(null);
		
		button = new JButton("Show RK2");
		button.setFocusable(false);
		//button.setBorderPainted(false);
		
		TextField = new JTextField();
		label = new JLabel("");
		
		int x = 50;
		int y = 50;
		
		button.setBounds(x, y, 150, 30);
		TextField.setBounds(x*5, y, 150, 30);
		label.setBounds(x, y*3, 150, 30);
		
		button.addActionListener(manager);
		
		this.add(button);
		this.add(TextField);
		this.add(label);
	}
	
	private class EventManager implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(button == e.getSource()) {
				String s = TextField.getText();
				label.setText(s);
				TextField.setText("");
			}
		}
	}

}
