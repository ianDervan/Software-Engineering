import java.awt.TextField;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;


public class MyGUI {
	
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setSize(800,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder("Text Editor"));
		frame.add(panel);
		
		panel.setLayout(new MigLayout("debug", "[]10[]","[][][]"));
		
		JLabel firstnameLabel = new JLabel("First Name");
		JLabel familynameLabel = new JLabel("Family Name");
		JTextField firstName = new JTextField(20);
		JTextField lastName = new JTextField(20);
		JButton lab1 = new JButton("Label #1");			JButton lab2 = new JButton ("Label #2");
		JButton  lab3 = new JButton("Label #3");			JButton  lab4 = new JButton("Label #4");
		JButton  lab5 = new JButton ("Label #5");			JButton  lab6 = new JButton ("Label #6");
		JTextArea displayText = new JTextArea(30,30);
		

		
		panel.add(lab1,"wrap");
		panel.add(lab2);
		panel.add(displayText);
		
	
		panel.add(lab3 ,"wrap");
		panel.add(lab4, "wrap");
		panel.add(lab5);
		panel.add(lab6);

	    
		
		frame.setVisible(true);
	}

}