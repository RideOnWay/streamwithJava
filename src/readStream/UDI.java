package readStream;

import java.io.*;
import java.util.*;
import baiscsThings.Coche;



public class UDI implements Serializable{

	private static final long serialVersionUID = -3282389322294282209L;

	public static void main(String[] args) {
		
		
		
		ArrayList<Object> lista1= new ArrayList<Object>();
		
		Object car = new Coche();
		Object car2 = new Coche();
		
		lista1.add(car);
		lista1.add(car2);
		
		
		try {
			
			 FileOutputStream fileOut=new FileOutputStream("C:/Users/alejo/Desktop/prueba1.dat");
			 ObjectOutputStream salida = new ObjectOutputStream(fileOut);
			 salida.writeObject(lista1);
			 salida.close();
		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		} catch (IOException e1) {
		
			e1.printStackTrace();
		}
		 
		
		
		try {
			FileInputStream enter = new FileInputStream("C:/Users/alejo/Desktop/prueba1.dat");
			ObjectInputStream entrada=new ObjectInputStream(enter);
			Object obj1 = (Object)entrada.readObject();
	        enter.close();
	        System.out.println(obj1.toString());
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
		
		
		
		System.out.println();
	}

}
