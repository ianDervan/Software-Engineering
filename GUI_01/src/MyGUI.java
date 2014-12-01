import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import net.miginfocom.swing.MigLayout;


public class MyGUI {
	
	JTextArea displayTextMain, displayTextSecondary;
	
	JButton buttGetFile;	
	JButton buttReverse;
	JButton buttSave;			
	JButton buttClearText;
	JButton buttEditText;			
	JButton buttSearch;
	JButton buttSelectAll;
	JButton buttUpperCase;	
	JButton buttPrint;
	JButton buttWordCount;			
	JButton buttDeleteFile;
	JButton buttSomthing;			
	JButton buttCopyFile;
	JButton buttSomthingElse;
	
	public MyGUI(){
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
		
		buttGetFile = new JButton("Get File");	
		buttReverse = new JButton("Revese");
		buttSave = new JButton("Save");			
		buttClearText = new JButton("Clear Text");
		buttEditText = new JButton("Edit Text");			
		buttSearch = new JButton("Search");
		buttSelectAll = new JButton("Select All");
		buttUpperCase = new JButton("Upper Case");	
		buttPrint = new JButton("Print");
		buttWordCount = new JButton("Word Count");			
		buttDeleteFile = new JButton("Delete File");
		buttSomthing = new JButton("Somthing");			
		buttCopyFile = new JButton("Copy File");
		buttSomthingElse = new JButton("Somthing Else");
		final JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
		
	  
		
		displayTextMain = new JTextArea(30,30);
		displayTextSecondary = new JTextArea(15,30);
		//trying to add panels of buttons as a separate panel so we can have 2 
		//panels of separate buttons then insert another panel containing the text field.
		
		panelButtons1.add(buttGetFile);
		panelButtons1.add(buttReverse);
		panelButtons1.add(buttSave);
		panelButtons1.add(buttClearText);
		panelButtons1.add(buttEditText);
		panelButtons1.add(buttSearch);
		panelButtons1.add(buttSelectAll); 
		panelButtons1.add(slider); 
		
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
		
		
		
		  slider.setMinorTickSpacing(2);
		    slider.setMajorTickSpacing(10);
		    slider.setPaintTicks(true);
		    slider.setPaintLabels(true);

		    slider.setLabelTable(slider.createStandardLabels(10));
		    
		    displayTextMain.append("How now");
		    
		   
		    
			 slider.addChangeListener(new ChangeListener() {

		            @Override
		            public void stateChanged(ChangeEvent e) {
		            
		                final int value = slider.getValue();
		                
		                	
		                	if(value>15)
		                	{
		                		
		                		Font font = new Font("Verdana", Font.BOLD, value);
		                		 displayTextMain.setFont(font);
		                		 displayTextMain.setForeground(Color.BLUE);
		            			 
		                	}
		                
		                }
		           
	    			
		            
		        });
			
        	
	    
		
		frame.setVisible(true);
	}

}
