package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {

public void write(String filePath) throws IOException{
		
		File fileObj = new File(filePath);						
		FileWriter writerObj = new FileWriter(fileObj, true);	
		PrintWriter printObj = new PrintWriter(writerObj);		
		
		for (int i = 0; i <3; i++){
			printObj.println("This is line " + i);		
		}
		
		printObj.close();		
	}

}
