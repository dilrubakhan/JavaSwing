package demo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {
	private JButton helloBtn;
	private JButton goodByBtn;
	
	private TextPannel textPanel;
	
	public Toolbar() {
		helloBtn = new JButton("Hello");
		goodByBtn = new JButton("Goodby");
		
		helloBtn.addActionListener(this);
		goodByBtn.addActionListener(this);	
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(helloBtn);
		add(goodByBtn);
	}
	
	public void setTextPanel(TextPannel textPanel) {
		this.textPanel = textPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton) e.getSource();
		if(clicked == helloBtn) {
			textPanel.appendTex("Hello\n");
		}
		else if(clicked == goodByBtn) {
			textPanel.appendTex("Goodby\n");
		}
		
	}
	
	

}
