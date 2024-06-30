import java.util.ArrayList; 
/*
                           *Programming Challenege #11* 
   Working with array operations in this one, I decided to do an ArrayList instead, this one was easy
*/

/**
   The ArrayOperations class hold several values in an array list then displays the sum, 
   average, highest, and lowest
*/ 

public class ArrayOperations { 
   public static void main(String[] args) {
   
      int sum ,highest ,lowest;
      double average; 

      ArrayList<Integer> array = new ArrayList <>(); // Learned about List but went with initialization 
       array.add(153);
       array.add(78);
       array.add(269);
       array.add(874);
       array.add(16520);
       array.add(612);
       array.add(123);
 
       sum = getTotal(array); 
       System.out.printf("\nSum: %d" ,sum);
       average = getAverage(array); 
       System.out.printf("\nAverage %,.0f" ,average); 
       highest = getHighest(array); 
       System.out.printf("\nHighest: %,d" , highest);
       lowest = getLowest(array); 
       System.out.printf("\nLowest: %,d" , lowest);
              
        
   } 
   
   /**
      The getTotal method calculates the sum
      @perma array The arraylist to get the total of
      @return sum The sum
   */ 
   
   public static int getTotal(ArrayList<Integer> array) { 
      
      int sum = 0; 
      
      for (int index = 0; index < array.size(); index++) { 
         sum += array.get(index); 
      } 
      return sum; 
   }  
   
   /**
      The getAverage method calculates the average
      @perma array The array list to get the average of
      @return average The average
   */ 
   
   public static double getAverage(ArrayList<Integer> array) { 
      
      int sum; 
      double average; 
      
      sum = getTotal(array); 
      average = sum / array.size(); 
      return average; 
   } 
   
   /**
      The getHighest method finds the highest value 
      @perma The array list to get the highest number from
      @return highest The highest number
   */ 
       
   public static int getHighest(ArrayList<Integer> array) { 
      
      int highest; 
      highest = array.get(0); 
      
      for (int index = 1; index < array.size(); index++) { 
         if (array.get(index) > highest) {  
            highest = array.get(index); 
         }  
      }
      return highest;
   }  
   
   /**
      The getLowest method finds the lowest value number
      @perma array The array list to find the lowest value in
      @return lowest The lowest number
   */ 
    
     public static int getLowest(ArrayList<Integer> array) {
     
      int lowest; 
      lowest = array.get(0); 
      
      for (int index = 1; index < array.size(); index++) { 
         if (array.get(index) < lowest) {  
           lowest = array.get(index); 
         } 
       
      }
      return lowest;
   }  
}
                                  
   