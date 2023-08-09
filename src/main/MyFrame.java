package main;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    private static String PATH_TO_THE_LOGO = "src/logo/logo_3.png";

    public MyFrame() {
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 		// exit out of application
	this.setTitle("Frame title goes here"); 			// sets title of the frame
	this.setResizable(false); 					// prevent frame from being resized
	this.setSize(420, 420); 				// sets x - dimension and y - dimension of the frame
	this.setVisible(true); 						// make the frame visible

	ImageIcon logo = new ImageIcon(PATH_TO_THE_LOGO); 		// create an imageIcon

	this.setIconImage(logo.getImage());
	this.getContentPane().setBackground(new Color(0x12345)); 	// change color of the background
    }
}
