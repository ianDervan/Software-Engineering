package migLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.SwingUtilities;


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

						} catch (Exception ex) {
							// TODO Auto-generated catch block
							log.log( Level.SEVERE, ex.toString(), ex );
						} 
					}
				});
			}
		} );


	}
}

