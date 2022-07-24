package readStream;

import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {

	public static void main(String[] args) {
		
		writing nuw = new writing();
		nuw.toWrite();

	}

}


class writing{
	
	public void toWrite() {
		
		String sentence = "This is a new sentence.";
		
		try {
			FileWriter letter = new FileWriter("C:/Users/alejo/Desktop/textproof.txt", true);
			
			for(int i = 0; i < sentence.length(); i++) {
				
				letter.write(sentence.charAt(i));
			}
			
			letter.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
			
	}
}
