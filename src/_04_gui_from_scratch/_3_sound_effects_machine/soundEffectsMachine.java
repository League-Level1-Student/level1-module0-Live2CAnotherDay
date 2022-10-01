package _04_gui_from_scratch._3_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class soundEffectsMachine {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton ("Wood ASMR!");
	public void showButton(){
		button.addActionListener((ActionListener) this);
		frame.add(panel);
		frame.setVisible(true);
		panel.add(button);
		frame.pack();
		
		frame.setTitle("Wood ASMR");
		System.out.println("Button clicked, incoming wood ASMR");
	}
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		
		if (button == buttonPressed) {
				playSound("sawing-wood-daniel_simon.wav");
		}
	}
	
	
	
	private void playSound(String soundFile) {
		String path = "src/_03_gui_from_scratch/_3_sound_effects_machine/";
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		
	}
    
	
}
/// Nothing else to work on here