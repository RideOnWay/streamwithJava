
 
 import java.io.FileInputStream;
 import java.io.FileNotFoundException;
 import java.io.FileOutputStream;
 import java.io.IOException;
 import java.io.ObjectInputStream;
 import java.io.ObjectOutputStream;
 
 
 
 public class MetodosLeerYescribir {
 
 }
 class Writing {
 	public void write(){

     try { 
        ObjectOutputStream savingDates1 = new ObjectOutputStream(new FileOutputStream("C:/Users/alejo/Desktop/EmployeeTotal.dat"));
     	savingDates1.writeObject(null); 
     	savingDates1.close(); 
     }
     catch(FileNotFoundException e) { 
     	e.printStackTrace(); }
     catch (IOException e){
     	e.printStackTrace(); }
 	}
 }
 
 
 
 class Reading{
 	
 	public void toRead() {
 		
 		
 		try {
 			FileInputStream enter = new FileInputStream("C:/Users/alejo/Desktop/EmployeeTotal.dat");
 			ObjectInputStream entrada=new ObjectInputStream(enter);
  			Cliente obj1 = (null)entrada.readObject();
  			Cliente.clientes.add(obj1);
  	        enter.close();
 	         System.out.println(obj1.toString());
 			
 		} catch (Exception e) {
 			
 			System.out.println(e);
 		}
 	
 	}
 }
