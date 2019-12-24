package demo;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPannel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextArea textArea;
	
	public TextPannel() {
		
		textArea = new JTextArea();
		
		setLayout(new BorderLayout());
		add(new JScrollPane(textArea), BorderLayout.CENTER);
	}
		public void appendTex(String text) {
			textArea.append(text);
		}
	
}
