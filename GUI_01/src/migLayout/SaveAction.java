package migLayout;

import java.io.BufferedWriter;
import java.io.FileWriter;


import javax.swing.SwingWorker;


public class SaveAction extends SwingWorker<Object, Object>{
	
	MyGUI mg;
	
	public SaveAction(MyGUI obj){
		mg = obj;
		
	}
	
	@Override
	protected Object doInBackground() throws Exception {
	
		try (BufferedWriter fileOut = new BufferedWriter(new FileWriter("String.txt"))) {
		    mg.displayTextMain.write(fileOut);
		}
		
		
		return null;
	}

}
