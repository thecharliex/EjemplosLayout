package TestLayouts;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestGridBagLayout extends Ventana {
	private static final long serialVersionUID = 1L;
	private GridBagLayout gridBagLayout = new GridBagLayout();
	private GridBagConstraints gridBagConstraints = new GridBagConstraints();

	public TestGridBagLayout(String title, int width, int height) {
		super(title, width, height);
		this.setLayout(gridBagLayout);
		
		// Crear los componentes de la GUI
		JTextArea textArea1 = new JTextArea("AreaTexto1", 5, 10);
		JTextArea textArea2 = new JTextArea("AreaTexto2", 2, 2);
		
		String nombres[] = {"Hierro", "Acero", "Bronce"};
		JComboBox<?> comboBox = new JComboBox<Object>(nombres);
		
		JTextField textField = new JTextField("TextField");
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		
		// weigthx y weigthy para textArea1 es 0, el predeterminado
		// anchor para todos es CENTER el predeterminado
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		addComponent(textArea1, 0,0,1,3);
		
		// weigthx y weigthy para button1 es 0, el predeterminado
		gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
		addComponent(button1, 0,1,2,1);
		
		// weigthx y weigthy para button1 es 0, el predeterminado
		// fill es HORIZONTAL
		addComponent(comboBox, 2, 1, 2, 1);
		
		// button2
		gridBagConstraints.weightx = 1000; // mas ancho
		gridBagConstraints.weighty = 1; // mas alto
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		addComponent(button2, 1, 1, 1, 1);
		
		// button3
		// fill es button2
		gridBagConstraints.weightx = 0; // mas ancho
		gridBagConstraints.weighty = 0; // mas alto
		addComponent(button3, 1, 2, 1, 1);
		
		addComponent(textField, 3, 0, 2, 1);
		
		addComponent(textArea2, 3, 2, 1, 1);
		
		
	}

	private void addComponent(Component component
			, int row
			, int col
			, int width
			, int height) {
		gridBagConstraints.gridx = col;
		gridBagConstraints.gridy = row;
		gridBagConstraints.gridwidth = width;
		gridBagConstraints.gridheight = height;
		gridBagLayout.setConstraints(component, gridBagConstraints);
		this.add(component);
		
	}



}
