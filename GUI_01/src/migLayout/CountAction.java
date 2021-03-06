package migLayout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;


public class CountAction {
	
	String nextLine;
	MyGUI mg;
	
	public CountAction(MyGUI obj){
		mg = obj;
		
	}
	
	public BufferedReader lineRead (){
		BufferedReader br = null;
		//StringReader sr = new StringReader(mg.originalArea.getText()); 
		//br = new BufferedReader(sr); 
		
		return br;
	}
	
	public void wordCount(){
		
		BufferedReader br = lineRead();
		
		ArrayList<String> wordsList = new ArrayList< String >();  //create list to store all words 
		
		try{
			while((nextLine = br.readLine()) != null){
				nextLine = nextLine.toLowerCase();
			    nextLine = nextLine.replaceAll("\\W"," ");     // regular expression to remove punctuation
			    nextLine = nextLine.replaceAll("\\s+"," ");
			    
			    String[] words = nextLine.split("\\s+");			//tokenize string with regular expression

			    wordsList.addAll(Arrays.asList(words));
			}
			    int count = 0;

			    for(int i = 0; i < wordsList.size(); i++)
			    {
			        //mg.countArea.append(wordsList.get(i) + "\t");
			        for( int j = 0; j < wordsList.size(); j++ )
			        {
			            if( wordsList.get(i).equals(wordsList.get(j)))			//Compares word (i) to all other words in string (j)
			                count++;
			            if( wordsList.get(i).equals(wordsList.get(j)) && count > 1)//removes duplicate words after count has incremented
			                wordsList.remove(j);                      

			        }           
			        String cnt = Integer.toString(count);			
			        //mg.countArea.append(cnt + "\n");
			        count = 0;
			    }					
		br.close();	
		}catch(IOException e){
			e.printStackTrace();
		}		
	}	

}
