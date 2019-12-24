package demo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private Toolbar toolbar;
	private TextPannel textPanel;

	
	public MainFrame () {
		super("Hello World!");
		
		setLayout(new BorderLayout());
		
		
		toolbar = new Toolbar();
		textPanel = new TextPannel();
		
		toolbar.setTextPanel(textPanel);
	
		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
