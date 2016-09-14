import java.awt.event.*;
import javax.swing.*;

public class View {
	public View(){
		initView();
	}
	
	public void initView(){
	    JFrame f = new JFrame("Text Field Examples");
	    f.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        f.setTitle("Password generator");
	    
	    JPanel p = new JPanel();
	    BoxLayout boxlayout = new BoxLayout(p, BoxLayout.Y_AXIS);
	    p.setLayout(boxlayout);
        
        JTextField textField = new javax.swing.JTextField();
        textField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textField.setEditable(false);
        textField.setFont(new java.awt.Font("Tahoma", 0, 24));
        p.add(textField);
        
        JButton button = new javax.swing.JButton();
        button.setFont(new java.awt.Font("Tahoma", 0, 24));
        button.setText("Generate password");
        button.setMargin(new java.awt.Insets(2, 0, 2, 0));
        button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		// TODO: implement action performed
        	}
        });
        
        p.add(button);
	    
        f.add(p);
	    f.pack();
	    f.setVisible(true);
	}

}
