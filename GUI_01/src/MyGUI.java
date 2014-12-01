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
		frame.setSize(750,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panelButtons1 = new JPanel();
		JPanel panelButtons2 = new JPanel();
		JPanel panelTextField = new JPanel();
		
		panelButtons1.setBorder(BorderFactory.createTitledBorder("Main Buttons"));
		panelButtons2.setBorder(BorderFactory.createTitledBorder("Secondary Buttons"));
		panelTextField.setBorder(BorderFactory.createTitledBorder("TextFields"));
		
		frame.getContentPane().setLayout(new MigLayout());
		frame.getContentPane().add(panelButtons1, "span, push, grow");
		frame.getContentPane().add(panelTextField, "span, push, grow");
		frame.getContentPane().add(panelButtons2, "span, push, grow");
		
		
		panelButtons1.setLayout(new MigLayout());
		panelButtons2.setLayout(new MigLayout());
		panelTextField.setLayout(new MigLayout());
		
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
		
		
		JTextArea displayTextMain = new JTextArea(30,30);
		JTextArea displayTextSecondary = new JTextArea(15,30);
		//trying to add panels of buttons as a separate panel so we can have 2 
		//panels of separate buttons then insert another panel containing the text field.
		
		panelButtons1.add(buttGetFile);
		panelButtons1.add(buttReverse);
		panelButtons1.add(buttSave);
		panelButtons1.add(buttClearText);
		panelButtons1.add(buttEditText);
		panelButtons1.add(buttSearch);
		panelButtons1.add(buttSelectAll); 
		
		//panel containing text area inserted between the two panels of buttons
		
		panelTextField.add(displayTextMain, "push, grow"); //textArea will grow when dragged
		panelTextField.add(displayTextSecondary, "push, grow"); //textArea will grow when dragged
		
		panelButtons2.add(buttUpperCase);
		panelButtons2.add(buttPrint);
		panelButtons2.add(buttWordCount);
		panelButtons2.add(buttDeleteFile);
		panelButtons2.add(buttSomthing);
		panelButtons2.add(buttCopyFile);
		panelButtons2.add(buttSomthingElse);
	    
		
		frame.setVisible(true);
	}

}
