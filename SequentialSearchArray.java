/**
   The SequentialSearchArray method is just me searching a simple array
   for a value, array is user defined nor is the search value
   this is just a proof of concept for me
*/
public class SequentialSearchArray { 
   public static void main(String[] args) { 
   
      int[] array = {90 ,78 ,43 ,77 ,100 ,93}; 
      int result, searchValue = 77; 
      
      result = search(array, searchValue); //The 100 passed to the method is the 
                                   //value to search for
      if (result == -1) { 
         System.out.printf("%d was not found, Sad!" ,searchValue); 
      } else {
         System.out.printf("%d was found: " + (result + 1) + " found" ,searchValue); 
      }   
         
   
   } 
   
   /**
      The search method finds the desired value in the array
      shockingly, useing another loop to perform this basic search
      @perma array2 The array to be search
      @perma searchValue The value to be search for in the array
      @retrun outcome The value that will tell if the search value was
         found and how many times 
   */ 
   
   public static int search(int array2[], int searchValue) { 
      boolean found; 
      int index, outcome; 
      found = false;
      index = 0; 
      outcome = -1; 
      
      while (!found && index < array2.length) { 
         if (array2[index] == searchValue) { 
         outcome++; 
         found = true; 
        } 
        index++; 
      } 
      return outcome; 
   } 
}  