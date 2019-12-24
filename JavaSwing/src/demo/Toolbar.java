package demo;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel {
	private JButton helloBtn;
	private JButton goodByBtn;
	
	public Toolbar() {
		helloBtn = new JButton("Hello");
		goodByBtn = new JButton("Goodby");
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(helloBtn);
		add(goodByBtn);
	}

}
