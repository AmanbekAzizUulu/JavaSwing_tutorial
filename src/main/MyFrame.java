package main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
    private static final long serialVersionUID = 1L;

    private String PATH_TO_THE_LOGO = "src/media/logo_3.png";
    private String PATH_TO_THE_LABEL = "src/media/label_1.jpg";

    public MyFrame() {
	
	ImageIcon logo = new ImageIcon(PATH_TO_THE_LOGO); 			// create an imageIcon

	this.setIconImage(logo.getImage()); 					// set an imageIcon
	this.getContentPane().setBackground(new Color(0x12345)); 		// change color of the background

	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 			// exit out of application
	this.setTitle("Frame title goes here"); 				// sets title of the frame
	this.setResizable(true); 						// prevent frame from being resized
	this.setSize(1000, 1000); 				// sets x - dimension and y - dimension of the frame
	this.setVisible(true); 							// make the frame visible

//	this.setLayout(null);

	this.add(new MyLabel().createLable());

	this.pack(); // use this method after adding all required components of the frame

    }

    private class MyLabel extends JLabel {
	private static final long serialVersionUID = 1L;
	
	private MyLabel createLable() {

	    // JLable - a GUI display area for a string of text, an image or both
	    MyLabel label = new MyLabel(); // create a label
	    ImageIcon image = new ImageIcon(PATH_TO_THE_LABEL);

//	    Border border = BorderFactory.createLineBorder(Color.RED,3);

	    label.setText("Bro, do you want some code?"); 					// set text of the label
	    label.setIcon(image);
	    label.setHorizontalTextPosition(JLabel.CENTER); 				// set text LEFT, RIGHT or CENTER of image icon
	    label.setVerticalTextPosition(JLabel.TOP); 					// set text BOTTOM, TOP or CENTER of image icon

	    label.setForeground(new Color(0xFF8C3F)); 					// set font color of text
	    label.setFont(new Font("Tahoma", Font.PLAIN, 30)); 		// set font of text

	    label.setIconTextGap(-100);

	    label.setBackground(Color.WHITE); 						// set background color
	    label.setOpaque(true); 							// display background color

//	    label.setBorder(border);							//label likes to take as much space as possible

	    label.setVerticalAlignment(JLabel.CENTER); 					// set vertical position both of icon and text within label
	    label.setHorizontalAlignment(JLabel.CENTER); 				// set horizontal position both of icon and text within label

	    label.setBounds(200, 200, 600, 600); 			// set x - and y- position within frame as well as dimensions

	    return label;
	}
    }

}
