package migLayout;

import java.awt.Color;
import java.awt.Dimension;
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
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
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

	
	private static  int fontSize = 8;

	public MyGUI(){
		JFrame frame = new JFrame();
		frame.setSize(750,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}


		JPanel panelButtons1 = new JPanel();
		JPanel panelButtons2 = new JPanel();
		JPanel panelTextField = new JPanel();
		JPanel panelEditText= new JPanel();
		
		
		panelButtons1.setBorder(BorderFactory.createTitledBorder("Main Buttons"));
		panelButtons2.setBorder(BorderFactory.createTitledBorder("Secondary Buttons"));
		panelTextField.setBorder(BorderFactory.createTitledBorder("TextFields"));
		panelEditText.setBorder(BorderFactory.createTitledBorder("TextFields"));


		panelButtons1.setBorder(BorderFactory.createTitledBorder("Main Buttons"));
		panelButtons2.setBorder(BorderFactory.createTitledBorder("Secondary Buttons"));
		panelTextField.setBorder(BorderFactory.createTitledBorder("TextFields"));

		frame.getContentPane().setLayout(new MigLayout());
		frame.getContentPane().add(panelButtons1, "span, push, grow");
		frame.getContentPane().add(panelTextField, "span, push, grow");
		frame.getContentPane().add(panelEditText, "span, push, grow");
		frame.getContentPane().add(panelButtons2, "span, push, grow");


		
		panelButtons1.setLayout(new MigLayout());
		panelButtons2.setLayout(new MigLayout());
		panelTextField.setLayout(new MigLayout());
		panelEditText.setLayout(new MigLayout());

		
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
		

		final JTextArea displayTextMain = new JTextArea(30,30);
		
		DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.addElement("BLACK");
        model.addElement("RED");
        model.addElement("BLUE");
        model.addElement("GREEN");
        model.addElement("WHITE");
        model.addElement("ORANGE");
        model.addElement("BLACK");
        
        DefaultComboBoxModel model1 = new DefaultComboBoxModel();
        model1.addElement("PLAIN     ");
        model1.addElement("BOLD");
        model1.addElement("ITALICS");
        
        DefaultComboBoxModel model2 = new DefaultComboBoxModel();
        model2.addElement("VERDANDA");
        model2.addElement("ARIAL");
        model2.addElement("OPEN SANS");
        model2.addElement("TIMES NEW ROMAN");
        model2.addElement("SERIF");
        model2.addElement("Helvetica");
       
		
		final JComboBox comboBox = new JComboBox(model);
		final JComboBox comboBox1 = new JComboBox(model1);
		final JComboBox comboBox2 = new JComboBox(model2);
		final JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
		slider.setPreferredSize(new Dimension(100, 80));
		final JTextArea displayTextSecondary = new JTextArea(15,15);
		JRadioButton rdbtn = new JRadioButton("Font size 10");
		JRadioButton rdbtn1 = new JRadioButton("Font size 14");
		JRadioButton rdbtn2 = new JRadioButton("Font size 18");



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

		
		panelEditText.add(rdbtn,"split 4, flowy, top, sgx" );
		panelEditText.add(rdbtn2,"sgx");
		panelEditText.add(rdbtn1,"sgx");
		panelEditText.add(slider,"sgx "); 
		
		panelEditText.add(comboBox,"split 3, flowy, top,gap 50px,gapbottom 20px, sgx"); 
		panelEditText.add(comboBox1,"gap 50px,gapbottom 20px,sgx"); 
		panelEditText.add(comboBox2,"gap 50px,sgx"); 

	
		panelEditText.add(displayTextSecondary, " gap 50px,push, grow,wrap"); //textArea will grow when dragged
	
		panelButtons2.add(buttUpperCase);
		panelButtons2.add(buttPrint);
		panelButtons2.add(buttWordCount);
		panelButtons2.add(buttDeleteFile);
		panelButtons2.add(buttSomthing);
		panelButtons2.add(buttCopyFile);
		panelButtons2.add(buttSomthingElse);

	    
       comboBox.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                	String colours = (String) comboBox.getSelectedItem();
                	System.out.println(colours);
                	if(colours.equals("BLACK"))
                	{
                		displayTextMain.setForeground(Color.BLACK);
                		displayTextSecondary.append("Font colour set to Black\n");
                		
                	}
                	else if(colours.equals("RED"))
                	{
                		displayTextMain.setForeground(Color.RED);
                		displayTextSecondary.setForeground(Color.RED);
                		displayTextSecondary.append("Font colour set to Red\n");
                	}
                	else if(colours.equals("BLUE"))
                	{
                		displayTextMain.setForeground(Color.BLUE);
                		displayTextSecondary.setForeground(Color.BLUE);
                		displayTextSecondary.append("Font colour set to Blue\n");
                	}
                	else if(colours.equals("GREEN"))
                	{
                		displayTextMain.setForeground(Color.GREEN);
                		displayTextSecondary.setForeground(Color.GREEN);
                		displayTextSecondary.append("Font colour set to Green\n");
                	}
                	else if(colours.equals("WHITE"))
                	{
                		displayTextMain.setForeground(Color.WHITE);
                		displayTextSecondary.setForeground(Color.WHITE);
                		displayTextSecondary.append("Font colour set to White\n");
                	}
                	else if(colours.equals("ORANGE"))
                	{
                		displayTextMain.setForeground(Color.ORANGE);
                		displayTextSecondary.setForeground(Color.ORANGE);
                		displayTextSecondary.append("Font colour set to Orange\n");
                	}
                
                }
            }            
        );
       comboBox1.addActionListener(
           new ActionListener(){
               public void actionPerformed(ActionEvent e){
                   
               	String fontType = (String) comboBox1.getSelectedItem();
               
               	if(fontType.equals("PLAIN     "))
               	{
               		
               		displayTextMain.setFont(displayTextMain.getFont().deriveFont(Font.PLAIN));
               		displayTextSecondary.setFont(displayTextMain.getFont().deriveFont(Font.PLAIN));
            		displayTextSecondary.append("Font text set to Plain\n");
            	
               	}
               	else if(fontType.equals("ITALICS"))
               	{
               		displayTextMain.setFont(displayTextMain.getFont().deriveFont(Font.ITALIC));
               		displayTextSecondary.setFont(displayTextMain.getFont().deriveFont(Font.ITALIC));
            		displayTextSecondary.append("Font text set to ITALIC\n");
               	}
            	else if(fontType.equals("BOLD"))
               	{
            		displayTextMain.setFont(displayTextMain.getFont().deriveFont(Font.BOLD));
            		displayTextSecondary.setFont(displayTextMain.getFont().deriveFont(Font.BOLD));
            		displayTextSecondary.append("Font text set to BOLD\n");
               		
               	}
               	
             
               }
           }            
       );
     
       
       comboBox2.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                	String fontType = (String) comboBox2.getSelectedItem();
                	System.out.println(fontType);
                	if(fontType.equals("VERDANDA"))
                	{
                		Font font = new Font("Verdanda", Font.PLAIN, fontSize);
                		 displayTextMain.setFont(font);
                		 displayTextSecondary.setFont(font);
                		 displayTextSecondary.append("Font type set to Verdanda\n");
                	}
                	else if(fontType.equals("ARIAL"))
                	{
                		Font font = new Font("arial", Font.PLAIN, fontSize);
                		 displayTextMain.setFont(font);
                		 displayTextSecondary.setFont(font);
                		 displayTextSecondary.append("Font type set to Arial\n");
                	}
                	else if(fontType.equals("OPEN SANS"))
                	{
                		Font font = new Font("open sans", Font.PLAIN, fontSize);
                		 displayTextMain.setFont(font);
                		 displayTextSecondary.setFont(font);
                		 displayTextSecondary.append("Font type set to Open Sans\n");
                	}
                	else if(fontType.equals("TIMES NEW ROMAN"))
                	{
                		Font font = new Font("times new roman", Font.PLAIN, fontSize);
                		 displayTextMain.setFont(font);
                		 displayTextSecondary.setFont(font);
                		 displayTextSecondary.append("Font type set to Times New Roman\n");
                	}
                	else if(fontType.equals("SERIF"))
                	{
                		Font font = new Font("Serif", Font.PLAIN, fontSize);
                		 displayTextMain.setFont(font);
                		 displayTextSecondary.setFont(font);
                		 displayTextSecondary.append("Font type set to Serif\n");
                	}
                	else if(fontType.equals("Helvetica"))
                	{
                		Font font = new Font("Helvetica", Font.BOLD, fontSize);
                		 displayTextMain.setFont(font);
                		 displayTextSecondary.setFont(font);
                		 displayTextSecondary.append("Font type set to Helvetica\n");
                	}
                
                }
            }            
        );
	

       	slider.setMinorTickSpacing(2);
	    slider.setMajorTickSpacing(10);
	    slider.setPaintTicks(true);
	    slider.setPaintLabels(true);

	    slider.setLabelTable(slider.createStandardLabels(10));
	   	    
		slider.addChangeListener(new ChangeListener() {
	
            @Override
            public void stateChanged(ChangeEvent e) {
            
                fontSize = slider.getValue();
                
                	
                	if(fontSize>15)
                	{
                		
                		Font font = new Font("Verdana", Font.PLAIN, fontSize);
                		 displayTextMain.setFont(font);
                		 displayTextMain.setForeground(Color.BLUE);
            			 
                	}
                
                }

	        });
		 
			rdbtn.addActionListener(new ActionListener(){
			    public void actionPerformed(ActionEvent e) {
			      // Do something here...
			    	fontSize =10;
			    	
			    	
			    	 Font font = new Font("", Font.BOLD, fontSize);
			    	 displayTextMain.setFont(font);
			    	 displayTextMain.setForeground(Color.BLUE);
					
			    }
			});
			
			rdbtn1.addActionListener(new ActionListener(){
			    public void actionPerformed(ActionEvent e) {
			      // Do something here...
			    	fontSize =14;
			    	
			    	 Font font = new Font("", Font.BOLD, fontSize);
			    	 displayTextMain.setFont(font);
			    	 displayTextMain.setForeground(Color.BLUE);
			    }
			});
			rdbtn2.addActionListener(new ActionListener(){
			    public void actionPerformed(ActionEvent e) {
			      // Do something here...
			    	fontSize =18;
			    	
			    	 Font font = new Font("", Font.BOLD, fontSize);
			    	 displayTextMain.setFont(font);
			    	 displayTextMain.setForeground(Color.BLUE);
			    }
			});

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
