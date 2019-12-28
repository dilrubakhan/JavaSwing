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
	private FormPanel formPanel;

	
	public MainFrame () {
		super("Hello World!");
		
		setLayout(new BorderLayout());
		
		
		toolbar = new Toolbar();
		textPanel = new TextPannel();
		formPanel = new FormPanel();
		
		toolbar.setStringListener(new StringListener() {
			public void textEmited(String text) {
				textPanel.appendTex(text);	
			}
		});
		
		formPanel.setFormListener(new FormListener() {
			public void formEnentOccurred(FormEvent e) {
				String name = e.getName();
				String occupation = e.getOccupation();
				
				textPanel.appendTex(name + ": " + occupation + "\n ");
			}
		});
		
	
		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		add(formPanel, BorderLayout.WEST);
		
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
