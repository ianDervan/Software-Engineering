package migLayout;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Window {

	private MyGUI mg;
	private FileChooser fc;
	private ReverseAction ra;
	private SaveAction sa;

	private final Logger log = Logger.getLogger( Window.class.getName() );

	public void openWindow(){
		mg = new MyGUI();	
		fc = new FileChooser(mg);
		ra = new ReverseAction(mg);


		mg.buttGetFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{ 
				SwingUtilities.invokeLater(new Runnable(){
					public void run(){
						try {
							fc.run();
						} catch (Exception ex) {
							// TODO Auto-generated catch block
							log.log( Level.SEVERE, ex.toString(), ex );
						}   
					}
				});

			}
		});

		mg.buttReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{ 
				SwingUtilities.invokeLater(new Runnable(){
					public void run(){
						try {
							ra.run();
							//mg.progress.setValue(0);
						} catch (Exception ex) {
							// TODO Auto-generated catch block
							log.log( Level.SEVERE, ex.toString(), ex );
						} 
					}
				});
			}
		} );

		mg.buttClearText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{ 
				SwingUtilities.invokeLater(new Runnable(){
					public void run(){
						try {
							mg.displayTextMain.setText("");
						} catch (Exception ex) {
							// TODO Auto-generated catch block
							log.log( Level.SEVERE, ex.toString(), ex );
						} 
					}
				});
			}
		} );


		mg.buttSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{ 
				SwingUtilities.invokeLater(new Runnable(){
					public void run(){
						try {
							//sa.run();
						} catch (Exception ex) {
							// TODO Auto-generated catch block
							log.log( Level.SEVERE, ex.toString(), ex );
						} 
					}
				});
			}
		} );
		
		mg.comboBox.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){

						String colours = (String) mg.comboBox.getSelectedItem();
						System.out.println(colours);
						if(colours.equals("BLACK"))
						{
							mg.displayTextMain.setForeground(Color.BLACK);
							mg.displayTextSecondary.append("Font colour set to Black\n");

						}
						else if(colours.equals("RED"))
						{
							mg.displayTextMain.setForeground(Color.RED);
							mg.displayTextSecondary.setForeground(Color.RED);
							mg.displayTextSecondary.append("Font colour set to Red\n");
						}
						else if(colours.equals("BLUE"))
						{
							mg.displayTextMain.setForeground(Color.BLUE);
							mg.displayTextSecondary.setForeground(Color.BLUE);
							mg.displayTextSecondary.append("Font colour set to Blue\n");
						}
						else if(colours.equals("GREEN"))
						{
							mg.displayTextMain.setForeground(Color.GREEN);
							mg.displayTextSecondary.setForeground(Color.GREEN);
							mg.displayTextSecondary.append("Font colour set to Green\n");
						}
						else if(colours.equals("WHITE"))
						{
							mg.displayTextMain.setForeground(Color.WHITE);
							mg.displayTextSecondary.setForeground(Color.WHITE);
							mg.displayTextSecondary.append("Font colour set to White\n");
						}
						else if(colours.equals("ORANGE"))
						{
							mg.displayTextMain.setForeground(Color.ORANGE);
							mg.displayTextSecondary.setForeground(Color.ORANGE);
							mg.displayTextSecondary.append("Font colour set to Orange\n");
						}

					}
				}            
				);
		
		mg.comboBox1.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){

						String fontType = (String) mg.comboBox1.getSelectedItem();

						if(fontType.equals("PLAIN     "))
						{

							mg.displayTextMain.setFont(mg.displayTextMain.getFont().deriveFont(Font.PLAIN));
							mg.displayTextSecondary.setFont(mg.displayTextMain.getFont().deriveFont(Font.PLAIN));
							mg.displayTextSecondary.append("Font text set to Plain\n");

						}
						else if(fontType.equals("ITALICS"))
						{
							mg.displayTextMain.setFont(mg.displayTextMain.getFont().deriveFont(Font.ITALIC));
							mg.displayTextSecondary.setFont(mg.displayTextMain.getFont().deriveFont(Font.ITALIC));
							mg.displayTextSecondary.append("Font text set to ITALIC\n");
						}
						else if(fontType.equals("BOLD"))
						{
							mg.displayTextMain.setFont(mg.displayTextMain.getFont().deriveFont(Font.BOLD));
							mg.displayTextSecondary.setFont(mg.displayTextMain.getFont().deriveFont(Font.BOLD));
							mg.displayTextSecondary.append("Font text set to BOLD\n");

						}


					}
				}            
				);

		mg.comboBox2.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){

						String fontType = (String) mg.comboBox2.getSelectedItem();
						System.out.println(fontType);
						if(fontType.equals("VERDANDA"))
						{
							Font font = new Font("Verdanda", Font.PLAIN, mg.fontSize);
							mg.displayTextMain.setFont(font);
							mg.displayTextSecondary.setFont(font);
							mg.displayTextSecondary.append("Font type set to Verdanda\n");
						}
						else if(fontType.equals("ARIAL"))
						{
							Font font = new Font("arial", Font.PLAIN, mg.fontSize);
							mg.displayTextMain.setFont(font);
							mg.displayTextSecondary.setFont(font);
							mg.displayTextSecondary.append("Font type set to Arial\n");
						}
						else if(fontType.equals("OPEN SANS"))
						{
							Font font = new Font("open sans", Font.PLAIN, mg.fontSize);
							mg.displayTextMain.setFont(font);
							mg.displayTextSecondary.setFont(font);
							mg.displayTextSecondary.append("Font type set to Open Sans\n");
						}
						else if(fontType.equals("TIMES NEW ROMAN"))
						{
							Font font = new Font("times new roman", Font.PLAIN, mg.fontSize);
							mg.displayTextMain.setFont(font);
							mg.displayTextSecondary.setFont(font);
							mg.displayTextSecondary.append("Font type set to Times New Roman\n");
						}
						else if(fontType.equals("SERIF"))
						{
							Font font = new Font("Serif", Font.PLAIN, mg.fontSize);
							mg.displayTextMain.setFont(font);
							mg.displayTextSecondary.setFont(font);
							mg.displayTextSecondary.append("Font type set to Serif\n");
						}
						else if(fontType.equals("Helvetica"))
						{
							Font font = new Font("Helvetica", Font.BOLD, mg.fontSize);
							mg.displayTextMain.setFont(font);
							mg.displayTextSecondary.setFont(font);
							mg.displayTextSecondary.append("Font type set to Helvetica\n");
						}

					}
				}            
				);


		mg.slider.setMinorTickSpacing(2);
		mg.slider.setMajorTickSpacing(10);
		mg.slider.setPaintTicks(true);
		mg.slider.setPaintLabels(true);

		mg.slider.setLabelTable(mg.slider.createStandardLabels(10));

		//mg.displayTextMain.append("How now");



		mg.slider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {

				mg.fontSize = mg.slider.getValue();


				if(mg.fontSize>15)
				{

					Font font = new Font("Verdana", Font.PLAIN, mg.fontSize);
					mg.displayTextMain.setFont(font);
					mg.displayTextMain.setForeground(Color.BLUE);

				}

			}



		});

		mg.rdbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// Do something here...
				mg.fontSize =10;
				System.out.println(mg.fontSize);

				Font font = new Font("", Font.BOLD, mg.fontSize);
				mg.displayTextMain.setFont(font);
				mg.displayTextMain.setForeground(Color.BLUE);

			}
		});

		mg.rdbtn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// Do something here...
				mg.fontSize =14;

				Font font = new Font("", Font.BOLD, mg.fontSize);
				mg.displayTextMain.setFont(font);
				mg.displayTextMain.setForeground(Color.BLUE);
			}
		});
		mg.rdbtn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// Do something here...
				mg.fontSize =18;

				Font font = new Font("", Font.BOLD,mg.fontSize);
				mg.displayTextMain.setFont(font);
				mg.displayTextMain.setForeground(Color.BLUE);
			}
		});



		mg.slider.setMinorTickSpacing(2);
		mg.slider.setMajorTickSpacing(10);
		mg.slider.setPaintTicks(true);
		mg.slider.setPaintLabels(true);

		mg.slider.setLabelTable(mg.slider.createStandardLabels(10));

		mg.displayTextMain.append("Hello now");



		mg.slider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {

				final int value = mg.slider.getValue();


				if(value>15)
				{

					Font font = new Font("Verdana", Font.BOLD, value);
					mg.displayTextMain.setFont(font);
					mg.displayTextMain.setForeground(Color.BLUE);

				}

			}



		});


	}
}

