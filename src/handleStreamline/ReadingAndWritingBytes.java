package handleStreamline;

import java.io.*;

public class ReadingAndWritingBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter = 0;
		
		int[] datesIn = new int[10834];
			
		try {
			
			FileInputStream readFile = new FileInputStream("C:/Users/alejo/Pictures/gif/fungi.JPG");
			
			boolean endFile = false;
			
			while(!endFile) {
				
				int byteIn = readFile.read();
				
				if(byteIn != -1)
					datesIn[counter]= byteIn; 
				else
					endFile= true;
				
				System.out.println (datesIn[counter] );
				
				
				counter++;
			}
			System.out.println(counter);
			
			newFile(datesIn);
			readFile.close();
			
		}catch(Exception e){
			System.out.println("Archivo no encontrado.");
		}
	}
	
	static void newFile(int[] newdate) {
		
		try {
			
			FileOutputStream newimage = new FileOutputStream("C:/Users/alejo/Pictures/gif/fungi_copy.JPG");
			
			for(int i = 0 ; i< newdate.length; i++) {
				
				newimage.write(newdate[i]);
			}
			
			newimage.close();
			
		}catch(Exception e) {
			
			System.out.println("Error al crear el archivo");
		}
	}

}
