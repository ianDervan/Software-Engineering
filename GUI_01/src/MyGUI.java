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
		
		JPanel panelButtons1 = new JPanel();
		JPanel panelButtons2 = new JPanel();
		
		panelButtons1.setBorder(BorderFactory.createTitledBorder("Buttons1"));
		panelButtons1.setBorder(BorderFactory.createTitledBorder("Buttons2"));
		
		
		frame.add(panelButtons1);
		frame.add(panelButtons2);
		
		panelButtons1.setLayout(new MigLayout("debug"));
		panelButtons2.setLayout(new MigLayout("debug"));
		
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
		
		//trying to add panels of buttons as a separate panel so we can have 2 
		//panels of separate buttons then insert another panel containing the text field.
		
		panelButtons1.add(buttGetFile, "span, grow, center, wrap");
		panelButtons1.add(buttSave, "span, grow, center, wrap");
		//panel.add(displayText, "span2, push, grow"); //textArea will grow when dragged
		panelButtons1.add(buttSearch, "span, grow, center, wrap");
		panelButtons1.add(buttSomthingElse, "span, grow, center, wrap");
		panelButtons1.add(buttDeleteFile, "span, grow, center, wrap");
		panelButtons1.add(buttSelectAll, "span, grow, center, wrap");
		panelButtons1.add(buttPrint, "span, grow, center, wrap"); 
		
		//panel containing text area inserted between the two panels of buttons
		
		panelButtons2.add(buttGetFile, "span, grow, center, wrap");
		panelButtons2.add(buttSave, "span, grow, center, wrap");
		//panel.add(displayText, "span2, push, grow"); //textArea will grow when dragged
		panelButtons2.add(buttSomthing, "span, grow, center, wrap");
		panelButtons2.add(buttUpperCase, "span, grow, center, wrap");
		panelButtons2.add(buttCopyFile, "span, grow, center, wrap");
		panelButtons2.add(buttClearText, "span, grow, center, wrap");
		panelButtons2.add(buttWordCount, "span, grow, center, wrap");
	    
		
		frame.setVisible(true);
	}

}
