package main;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

    private static String PATH_TO_THE_LOGO = "src/logo/logo_3.png";
    public static void main(String[] args) {
	//JFrame - a GUI window to add components to
	JFrame frame = new JFrame(); 				// Creates frame 
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	// exit out of application
	frame.setTitle("JFrame title goes here"); 		// sets title of the frame 
	frame.setResizable(false); 				// prevent frame from being resized
	frame.setSize(420, 420); 		// sets x - dimension and y - dimension of the frame 
	frame.setVisible(true);					// make the frame visible
	
	ImageIcon logo = new ImageIcon(PATH_TO_THE_LOGO);	// create an imageIcon
	
	frame.setIconImage(logo.getImage());
	frame.getContentPane().setBackground(new Color(0x12345));	// change color of the background
	
    }

}
