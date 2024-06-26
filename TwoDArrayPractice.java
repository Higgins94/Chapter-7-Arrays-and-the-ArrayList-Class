/**
   The twoDArrayPractice method is practice for me using a 2D array
   I have three other methods I did not bother to comment on due to 
   this program being so basic, those methods just get the 2D array's row total
   ,column total and show all the numbers in the array
*/ 
public class TwoDArrayPractice { 
   public static void main(String[] args) { 
   
      int array[][] = { {5 ,10 ,15}, 
                        {20 ,25 ,30}, 
                        {35 ,40 ,45} };
      show(array); 
      System.out.print("\n__________________");
      System.out.println(""); 
      rowSum(array);
      System.out.print("\n__________________");
      System.out.println(""); 
      colSum(array); 
   
   }
   
   
   public static void show(int array[][]) { 
      for (int row = 0; row < array.length; row++) { 
         System.out.println("");   
         for (int col = 0; col < array[row].length; col++) { 
            System.out.print(array[row][col] + " ");
            
         } 
      } 
   }

   public static void rowSum(int[][]array){ 
       int total; 
       for (int row = 0; row < array.length; row++) { 
         total = 0;    
         for (int col = 0; col < array[row].length; col++) { 
            total += array[row][col];
         } 
         System.out.println("");
         System.out.printf("Total for Row %d: %d" ,row ,total); 
       } 
   }
   
   public static void colSum(int array[][]) { 
      int total; 
      for (int col = 0; col < array[0].length; col++) { 
         total = 0; 
         for (int row = 0; row < array.length; row++) { 
            total += array[row][col]; 
         } 
         System.out.println(""); 
         System.out.printf("Total for Column %d: %d" ,col ,total);   
      } 
   }




}                 
    
                        
       