import javax.swing.JOptionPane; 
import java.io.*;  
/*

                            *Progamming Challenge 12*
   This challenege is the same as programming challenege 11 (ArrayOperations) but all the numbers come from file
   Makes an object from NumberAnalysis class

*/

/**
   The NumberAnalysisDemo takes a file and gives sum, average, highest, lowest for the numbers in said file
*/ 
public class NumberAnalysisDemo { 
   public static void main(String[] args) throws IOException { 
   
      int sum, highest, lowest; 
      double average;
      String filename;
      filename = JOptionPane.showInputDialog("Enter the name of the file, including extension"); 
     
      NumberAnalysis fileOutput = new NumberAnalysis(filename);
      sum = fileOutput.getTotal(); 
      System.out.printf("\nTotal: %,d" ,sum); 
      average = fileOutput.getAverage(); 
      System.out.printf("\nAverage: %,.0f" ,average);
      highest = fileOutput.getHighest();
      System.out.printf("\nHighest: %,d" ,highest);
      lowest = fileOutput.getLowest();
      System.out.printf("\nLowest: %,d" ,lowest); 
   }
}  
       
      
      
      