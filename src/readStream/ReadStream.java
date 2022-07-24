package readStream;
import java.io.*;


public class ReadStream {

	public static void main(String[] args) {
		
		reading first = new reading();
		first.toRead();

	}

}

class reading{
	
	public void toRead() {
		
		try {
			FileReader enter = new FileReader("C:/Users/alejo/Desktop/textproof.txt");
			int c= 0;
			while(c != -1) {
				
				 c=enter.read();
				 
				 if(c == -1) {
					 break;
				 }
				
				char word = (char)c;
				
				System.out.print(word);
			}
			
			enter.close();
			
		} catch (Exception e) {
			
			System.out.println("File not found");
		}
		
	}
}
