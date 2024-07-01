import java.util.ArrayList; 
import java.util.Scanner; 
import javax.swing.JOptionPane; 
import java.io.*; 
/*
                                        *Programming Challenge 14*
         More complex operations performed on an array list than challenge 13, still working within a file
*/ 

/**
   The PopulationData class stores data about a population from a file to an array list, then calculates the 
   average population change, the highest population change ,and the lowest population change. The file is assumed to have 
   one year's population per line, and the base year in this case was 1950.
*/ 

public class PopulationData  { 
   public static void main(String[] args) throws IOException { 
   
      ArrayList<Integer> population = new ArrayList<>(); 
      String input; 
      
      input = JOptionPane.showInputDialog("File Name that Contains Population Data  ");
      
      population = setPopArray(input);
      System.out.print("\nNumbers Are In Thousounds" + 
      "\n------------------------------"); 
      popChange(population); 
      getGreatest(population); 
      getLowest(population); 
       
  } 
  
  /**
   The setPopArray method copies the data from the file to the array list
  */ 
  
   public static ArrayList<Integer> setPopArray(String filename) throws IOException {
      
      File file = new File(filename); 
      Scanner readFile = new Scanner(file);
      ArrayList<Integer> population = new ArrayList<>();     
      
      String input;
      int number; 
      
      while (readFile.hasNext()) {
         input = readFile.nextLine();
         number = Integer.parseInt(input); 
         population.add(number);  
      } 
      return population; 
   } 
   
   /**
      The popChange methods calculates the average annual change in population during the time period 
   */ 
   
   public static void popChange(ArrayList<Integer> population) { 
      
      int difference = 0 ,base;;
      double average = 0.0;  
     
      base = population.get(0); 
      
      for (int index = 1; index < population.size(); index++) {
          difference += population.get(index) - base; 
          base =  population.get(index);
      } 
      average = difference / (population.size() - 1);
      System.out.printf("\nAverage Annual Change in Population: %,.0f" ,average); 
   } 
   
   /**
      getGreatest the year with the greatest population change population 
   */ 
   
   public static void getGreatest(ArrayList<Integer> population) { 
      
      final int BASE_YEAR = 1950; 
      int base ,year = 0 ,highest ,difference = 0; 
      double average; 
      
      base = population.get(0); 
      highest = population.get(1) - base;
       
      for (int index = 1; index < population.size(); index++) {
          difference += population.get(index) - base; 
          
          if (difference > highest) { 
            highest = difference;
            year = index + 1; 
          } 
          
          difference = 0; 
          base =  population.get(index);   
      }
      
      if (year != 1) { 
         System.out.printf("\nHighest change was from " 
         + (BASE_YEAR + (year - 1)) +  " to " + (BASE_YEAR + year) + " with a population change of %,d" ,highest);
      } else { 
         System.out.printf("\nHighest change was from " 
         + (BASE_YEAR + year) +  " to " + (BASE_YEAR + (year + 1)) + " with a population change of %,d" ,highest);
      } 

   }
   
   
   /**
      The getLowest method caculates the lowest population change
   */ 
   
   public static void getLowest (ArrayList<Integer> population) { 
   
      final int BASE_YEAR = 1950; 
      int base ,year = 0 ,difference = 0, lowest; 
      double average; 
      
      base = population.get(0); 
      lowest = population.get(1) - base;
       
      for (int index = 1; index < population.size(); index++) {
          difference += population.get(index) - base; 
          
          if (difference < lowest) { 
            lowest = difference; 
            year = index + 1; 
          } 
          
          difference = 0; 
          base =  population.get(index);  
      }
      if (year != 1) { 
         System.out.printf("\nLowest change was from " 
         + (BASE_YEAR + year) +  " to " + (BASE_YEAR + (year + 1)) + " with a population change of %,d" ,lowest);
      } else { 
         System.out.printf("\nLowest change was from " 
         + (BASE_YEAR + year) +  " to " + (BASE_YEAR + (year + 1)) + " with a population change of %,d" ,lowest);
      } 
   }
}

   
      
       
      
      