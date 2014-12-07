import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.SwingUtilities;


public class Window {
	

	private final Logger log = Logger.getLogger( Window.class.getName() );
	 

	public void openWindow(){
		final MyGUI mg = new MyGUI();	

		final FileChooser fc = new FileChooser(mg);
		final ReverseAction ra = new ReverseAction(mg);


		mg.buttGetFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{ 
				SwingUtilities.invokeLater(new Runnable(){
					public void run(){
						try {
							fc.doInBackground();
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
							ra.doInBackground();
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

	}
}

