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
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder("Text Editor"));
		frame.add(panel);
		
		panel.setLayout(new MigLayout("debug"));
		
		JLabel firstnameLabel = new JLabel("First Name");
		JLabel familynameLabel = new JLabel("Family Name");
		JTextField firstName = new JTextField(20);
		JTextField lastName = new JTextField(20);
		
		JButton buttGetFile = new JButton("Get File");	
		JButton buttReverse = new JButton("Revese");
		JButton buttSave = new JButton("Save");			
		JButton buttClearText = new JButton("Clear Text");
		JButton buttEditText = new JButton("Edit Text");			
		JButton buttSearch = new JButton("Search");
		JButton buttSelectAll = new JButton("Select All");
		JButton buttUpperCase = new JButton("Upper Case");	
		JButton buttPrint = new JButton("Print");
		JButton buttWordCount = new JButton("Word Count");			
		JButton buttDeleteFile = new JButton("Delete File");
		JButton buttSomthing = new JButton("Somthing");			
		JButton buttCopyFile = new JButton("Copy File");
		JButton buttSomthingElse = new JButton("Somthing Else");
		
		
		JTextArea displayText = new JTextArea(30,30);
		
		
		panel.add(buttGetFile, "span, center, wrap");
		panel.add(buttSave, "split 2");
		panel.add(displayText, "span2, push, grow"); //textArea will grow when dragged
		panel.add(buttSearch, "wrap");

		//trying to add more buttons under neath each other but having problems
		//Also new pencil drawing in git repo
	    
		
		frame.setVisible(true);
	}

}
