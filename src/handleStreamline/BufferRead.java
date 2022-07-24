package handleStreamline;
import java.io.*;


public class BufferRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reading first = new reading();
		first.toRead();

	}

}

class reading{
	
	public void toRead() {
		
		try {
			
			
			FileReader enter = new FileReader("C:/Users/alejo/Desktop/textproof.txt");
			
			BufferedReader reading = new BufferedReader(enter);
			
			String words = "";
			
			while(words != null) {
				
				words = reading.readLine();
				
				if(words != null)
				System.out.println(words);
			}
			
			enter.close();
			
		} catch (Exception e) {
			
			System.out.println("File not found");
		}
		
	}
}
