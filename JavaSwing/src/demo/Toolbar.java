package demo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {
	private JButton helloBtn;
	private JButton goodByBtn;
	
	private StringListener textListener;
	
	public Toolbar() {
		helloBtn = new JButton("Hello");
		goodByBtn = new JButton("Goodby");
		
		helloBtn.addActionListener(this);
		goodByBtn.addActionListener(this);	
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(helloBtn);
		add(goodByBtn);
	}
	
	public void setStringListener(StringListener listener) {
		this.textListener = listener;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton) e.getSource();
		if(clicked == helloBtn) {
			if(textListener != null) {
				textListener.textEmited("Hello\n");
			}
		}
		else if(clicked == goodByBtn) {
			if(textListener != null) {
				textListener.textEmited("Goodby\n");
			}
		}
		
	}
	
	

}
