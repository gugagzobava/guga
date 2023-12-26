import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.program.GraphicsProgram;

public class problem68 extends GraphicsProgram {
	private JTextField textField;
	private JButton enterButton;

	public void init() {
		textField = new JTextField(20);
		enterButton = new JButton("enter");
		add(textField, SOUTH);
        add(enterButton, SOUTH);
        textField.addActionListener(this);
   //     addActionListeners();
	}

	public void run() {
		
	}
	 public void actionPerformed(ActionEvent e) {
	//	 println("here");
		 if(e.getSource() == textField){
			 String text = textField.getText();
			 println(text);
			 textField.setText("");
		 }
	 }

}
