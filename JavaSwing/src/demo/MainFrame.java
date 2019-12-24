package demo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame{
	
	private JTextArea textArea;
	private JButton btn;
	
	public MainFrame () {
		super("Hello World!");
		
		setLayout(new BorderLayout());
		
		textArea = new JTextArea();
		btn = new JButton("Click Me");
		
		btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				textArea.append("hello \n");
			}
		});
		
		add(textArea, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	

}
