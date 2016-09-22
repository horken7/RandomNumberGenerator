import java.awt.event.*;
import javax.swing.*;

public class View{
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JButton button;
	
	public View(){
		this.frame = new JFrame();
		this.panel = new JPanel();
		this.label = new JLabel();
		this.button = new JButton();		
		initView();
	}
	
	public void initView(){
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		button.setText("Press me");
		button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		updateView("Updated!");
        	}
        });
		updateView("This is a label!");
		frame.setSize(300,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	public void updateView(String s){
		label.setText(s);
		panel.add(label);
		panel.add(button);
		frame.add(panel);
	}	
}
