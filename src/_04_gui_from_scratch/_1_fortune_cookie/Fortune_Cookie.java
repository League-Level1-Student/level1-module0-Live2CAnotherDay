package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fortune_Cookie implements ActionListener {
	 public void showButton() {
         System.out.println("Button clicked");
         
         JFrame frame = new JFrame();
         frame.setVisible(true);
         
         JButton button = new JButton();
         frame.add(button);
         
         frame.pack();
         
         button.addActionListener(this);
         
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo!");
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "You will become  famous however end in a unprecedented demise!");
		}else if(rand == 1){
			JOptionPane.showMessageDialog(null, "Don't try asking out your crush, pretty sure she will reject you.");
		}else if(rand == 2){
			JOptionPane.showMessageDialog(null, "You will fail and fail and fail and SUCCEED ... to fail.");
		}
		else if(rand == 3){
			JOptionPane.showMessageDialog(null, "Surpise! Theres nothing here or later in your life.");
		}
		else if(rand == 4){
			JOptionPane.showMessageDialog(null, "What's something better than getting a good fortune?");
		}else if(rand == 5){
			JOptionPane.showMessageDialog(null, "If I told you a True or False Questions ");
		}
		
	}

	
}
/// Nothing else to Work here.
