package ninthmay;

import java. io.*; 

public class FileH {
	public static void main(String args[ ] ){ 
		
			// create a java folder in c before running
		
		
			File file = new File("c:\\java\\abc.txt");
			
			
			//create new file if it dne
			try {
				if(!file.exists()) {
				file.createNewFile();
				System.out.println("creatged");
			}
				else
					System.out.println("File with same name already exists");
			}	
			catch(IOException e) {
				System.out.println("Exception occured while creating the file....");
			}
			
		
			
			
			//methods
			
			System.out.println(file.exists());
		
			if(file.isDirectory())
			System.out.println("This is a directory");
			else
				System.out.println("This is not a directory");
			
			
			System.out.println("Name of file is: "+file.getName());
			System.out.println("Path: "+file.getPath());
			System.out.println("Absolute path: "+file.getAbsolutePath());
		

		
		
		
		
 } 
	
}