import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
		
		DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.addElement("BLACK");
        model.addElement("RED");
        model.addElement("BLUE");
        model.addElement("GREEN");
        model.addElement("WHITE");
        model.addElement("ORANGE");
        model.addElement("BLACK");
		
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
		final JComboBox comboBox = new JComboBox(model);
		final JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
		
	   
		
	  
		
		final JTextArea displayTextMain = new JTextArea(30,30);
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
		panelButtons1.add(slider); 
		panelButtons1.add(comboBox); 
		
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
		                
		                	
            	if(value>5)
            	{
		                		
            		Font font = new Font("Verdana", Font.BOLD, value);
            		displayTextMain.setFont(font);
        		 	displayTextMain.setForeground(Color.BLUE);
		    
            	}
		                
		    }
		       
        });
	    
       comboBox.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        
                    	String colours = (String) comboBox.getSelectedItem();
                    	System.out.println(colours);
                    	if(colours.equals("BlACK"))
                    	{
                    		displayTextMain.setForeground(Color.BLACK);
                    	}
                    	else if(colours.equals("RED"))
                    	{
                    		displayTextMain.setForeground(Color.RED);
                    	}
                    	else if(colours.equals("BLUE"))
                    	{
                    		displayTextMain.setForeground(Color.BLUE);
                    	}
                    	else if(colours.equals("GREEN"))
                    	{
                    		displayTextMain.setForeground(Color.GREEN);
                    	}
                    	else if(colours.equals("WHITE"))
                    	{
                    		displayTextMain.setForeground(Color.WHITE);
                    	}
                    	else if(colours.equals("ORANGE"))
                    	{
                    		displayTextMain.setForeground(Color.ORANGE);
                    	}
                    	else if(colours.equals("BlACK"))
                    	{
                    		displayTextMain.setForeground(Color.BLACK);
                    	}
                    }
                }            
        );
	
    
	    
	    
	    
	    
			
        	
	    
		
		frame.setVisible(true);
	}

}
