package TestLayouts;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TestFlowLayout extends Ventana implements ActionListener {
	private static final long serialVersionUID = 1L;
	JButton[] arrayButtons = new JButton[10];
	FlowLayout flowLayout = new FlowLayout();
	Container container = this.getContentPane();

	public TestFlowLayout(String title, int width, int height) {
		super(title, width, height);
		
		this.setLayout(flowLayout);
		
		for(int i = 0; i < 3; i++) {
			arrayButtons[i] = new JButton("Button " + i);
			arrayButtons[i].addActionListener(this);
			container.add(arrayButtons[i]);
		}
		
		arrayButtons[0].setText("<-- Izquierda");
		arrayButtons[0].setToolTipText("Alinear a la izquierda el contenedor");
		arrayButtons[1].setText(" | Centro | ");
		arrayButtons[1].setToolTipText("Alinear a la centro el contenedor");
		arrayButtons[2].setText("Derecha -->");
		arrayButtons[2].setToolTipText("Alinear a la derecha el contenedor");
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if(arrayButtons[0] == event.getSource()) {
			flowLayout.setAlignment(FlowLayout.LEFT);
			flowLayout.layoutContainer(container);
		} else if(arrayButtons[1] == event.getSource()) {
			flowLayout.setAlignment(FlowLayout.CENTER);
			flowLayout.layoutContainer(container);
		} else if(arrayButtons[2] == event.getSource()) {
			flowLayout.setAlignment(FlowLayout.RIGHT);
			flowLayout.layoutContainer(container);
		}
	}

}
