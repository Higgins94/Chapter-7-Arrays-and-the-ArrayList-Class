import java.util.Scanner;
import java.util.ArrayList; 
import java.io.*;  

/*
                            *Progamming Challenge 12*
This challenege is the same as programming challenege 11 (ArrayOperations) but all the numbers come from file
                     
*/
/**
   The NumberAnalysis class reads and stores numbers from a file then finds the sum, average, highest, lowest
*/ 

public class NumberAnalysis { 

   private ArrayList<Integer> array = new ArrayList<>(); 
   private File file;
   private Scanner scan; 
   private ArrayList<Integer> fileArray = new ArrayList<>(); 
   private int sum; 
   
   /**
      Constructor creates file object and assigns scanner
      @perma filename The name of the file to be read
   */ 
   
   public NumberAnalysis (String filename) throws IOException { 
      file = new File(filename);
      scan = new Scanner(file);
      sum = 0;  
      setTotal();  
   }
   
   /**
      The setTotal method calculates the sum of all the numbers in the file
   */ 
   
   public void setTotal() { 
      
      int number; 
      String input;
      
      while (scan.hasNext()) { 
         input = scan.nextLine(); 
         number = Integer.parseInt(input);
         fileArray.add(number); 
         sum += number; 
      } 
   } 
   
   /**
      The getTotal method returns sum
      @return sum The sum 
   */ 
   
   public int getTotal() { 
      return sum; 
   } 
   
   /**
      The getAverage method caculates the average from the sum 
      @return average The average
   */
   
    public double getAverage() { 
      
      double average;
      average = sum / fileArray.size(); 
      return average;  
    } 
    
    /**
      The getHighest method finds the highest number from the file
      @highest The value for the highest number
    */ 
    
     public int getHighest() { 
      
      int highest; 
      highest = fileArray.get(0); 
      
      for (int index = 1; index < fileArray.size(); index++) { 
         if (fileArray.get(index) > highest) {  
            highest = fileArray.get(index); 
         }  
      }
      return highest;
   }  
   
   /**
      The getLowest method finds the value for the lowest number
      @lowest The value for the lowest number
   */ 

    
   public int getLowest() {
     
      
      int lowest; 
      lowest = fileArray.get(0); 
      
      for (int index = 1; index < fileArray.size(); index++) { 
         if (fileArray.get(index) < lowest) {  
           lowest = fileArray.get(index); 
         } 
       
      }
      return lowest;
   }  
}
         
  
      
      
      

   
  