package gui;

import java.awt.GridLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DebugDialog extends JFrame{

	private JTextArea field;
	
	public DebugDialog(JFrame parent) {
		super("Okno wyswietlające dane wybranych obietów");
		
		field = new JTextArea();
		
		getContentPane().add(field);
		
		setBounds(900, 100, 250, 70);
		
		setLayout(new GridLayout(1,1));
		setVisible(false);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	public void showDialog() {
		setVisible(true);
	}
	
	public void hideDialog() {
		setVisible(false);
	}

	public void updateText(String text) {
		field.setText(text);
	}
	
	public void addText(String text) {
		field.setText(field.getText() + "\n" + text);
	}
	
	public void clearText() {
		field.setText("");
	}
}
