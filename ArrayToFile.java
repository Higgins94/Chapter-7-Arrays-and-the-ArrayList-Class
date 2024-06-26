import java.io.*; 
import java.util.Scanner; 
import javax.swing.JOptionPane; 
/**
   The ArrayToFile method is just me quickly making a method that sends an 
   array to a file, straightforward enought, just for giggles. 
*/ 
public class ArrayToFile { 
   public static void main(String[] args) throws IOException { 
   
      String filename; 
      int[] array = {54 ,43 ,6543 ,4525 ,4323 ,4654 ,742 ,470}; 
      
      filename = JOptionPane.showInputDialog("Enter the file name"); 
      File file = new File(filename); 
      PrintWriter output = new PrintWriter(file);  
      
      for (int i = 0; i < array.length; i++) { 
         output.println("");
         output.println(array[i]); 
      } 
      output.close(); 
      System.exit(0); 
      
   }
} 


      
      