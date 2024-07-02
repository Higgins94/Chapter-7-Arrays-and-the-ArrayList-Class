import java.util.Scanner; 
/*
                                                   *Programming Challenge 16*
                                    Throwing some 2d array operations now. The purpose of this challenge 
              is to make sure you  are visualizing the table of a 2d array correctly, hence the the row and column total methods. 
         I think the book gives a poor concept on how to viualize a 2d array, but once you understand that its an array within an array, 
   the concept becomes much clearer; And the the ability to scale up to 3d, 4d, etc... is much more easy in my option. Had no trouble with this one
*/

/**
   The ArrayOperations2 class creates a 2d array with the size delcarations given by user, then store 
   inputs given by user ot said array, then finds total, average, row total, column total, lowest in row, highest in row
*/
public class ArrayOperations2 { 
  public static void main(String[] args) { 
   
      int input ,rows ,cols, total, rTotal ,cTotal ,highest ,lowest;
      double average; 
      
      Scanner scan = new Scanner(System.in); 
   
      System.out.print("\nNumber of rows: "); 
      rows = scan.nextInt(); 
      System.out.print("\nNumber of columns: "); 
      cols = scan.nextInt(); 
   
      int[][] array = new int[rows][cols]; 
   
      for (int row = 0; row < rows; row++) { 
         System.out.print("\nFor Row " + (row + 1) + 
             "\n-----------" );
         for (int col = 0; col < cols; col++) {  
            System.out.print("\nFor Column " + (col + 1) + ": "); 
            input = scan.nextInt();
            array[row][col] = input;  
         }    
      } 
      total = getTotal(array);
      System.out.printf("\nSum: %,d\n------------" ,total); 
      average = getAverage(array); 
      System.out.printf("\nAverage: %,.2f\n------------" + 
         "\nGet Total for Row Number: " ,average);  
      rows = scan.nextInt(); 
      rows--; 
      rTotal = getRowTotal(array, rows);
      System.out.printf("\nRow Total: %,d\n----------------" + 
         "\nGet Total for Column: " ,rTotal);
      cols =  scan.nextInt();
      cols--; 
      cTotal = getColTotal(array, cols);
      System.out.printf("\nColumn Total: %,d\n---------------------" + 
         "\nHighest Integer for Row Number: ",cTotal);
      rows = scan.nextInt();
      rows--; 
      highest = getHighest(array ,rows); 
      System.out.printf("\nHighest Number: %,d\n---------------------" +
          "\nLowest Integer for Row Number: ",highest);
      rows = scan.nextInt();
      rows--; 
      lowest = getLowest(array ,rows);
      System.out.printf("\nLowest Number %,d" ,lowest); 
     
   } 
   
   /**
      The getTotal method calculates the sum of the array
      @perma array The array to get sum from
      @return total The sum of all the elements
   */ 
   
   public static int getTotal(int[][] array) {
   
      int total = 0; 
      
      for (int rows = 0; rows < array.length; rows++) { 
        
         for (int cols = 0; cols < array[rows].length; cols++) { 
            total += array[rows][cols]; 
         } 
      } 
      return total;    
   }  
   
   /**
      The getAverage method calculates the average for all elements in the array
      @perma array The array to get the average of 
      @return average The sum of the array elements divided by the number of elements 
   */   
   
   public static double getAverage(int[][] array) { 
      
      int total;
      double average ,div = 0;  
      total = getTotal(array); 
   
      for (int row = 0; row < array.length; row++) {  
        
         for (int col = 0; col < array[row].length; col++) { 
            div++;
         } 
      } 
      average = total / div; 
      return average;
   }   

   /**
      The getRowTotal method calculates the sum of all the elements in a given row 
       @perma array The array to to get the row sum from
       @perma row The row number to get the sum of the elements 
       @return total The sum of the row's elements 
   */ 
   
   public static int getRowTotal (int[][] array, int row) { 
      
      int total = 0; 
      
      for (int c = 0; c < array[row].length; c++) { 
         total += array[row][c]; 
      } 
      
      return total; 
   }    
   
   /**
      The getColTotal method calculates the sum for a given column
       @perma array The array to to get the column sum from
       @perma col The column number to get the sum of the elements
       @return total The sum of the column's elements 
   */   
   
   public static int getColTotal(int[][] array, int col) {  
      
      int total; 
      total = 0; 
      
      for (int r = 0; r < array.length; r++) { 
         total += array[r][col]; 
      } 
      
      return total; 
   } 
  
  /*
   The getHighest calculates the highest integer in a given row
    @perma array The array the contains the rows to find highest number in 
    @perma row The row number to find the highest integer in
    @return highest The value for the highest number
  */ 
  
   public static int getHighest(int[][] array, int row) { 
      
      int highest; 
      highest = array[row][0];
      
      for (int c = 1; c < array.length; c++) { 
         if (array[row][c] > highest) { 
            highest = array[row][c]; 
         }    
      } 
      return highest; 
   } 
      
  /**
   The getLowest calculates the lowest integer in a given row
  @perma array The array the contains the rows to find lowest number in 
  @perma row The row number to find the lowest integer in
  @return lowest The value for the lowest number
 
  */
  
   public static int getLowest(int[][] array, int row) { 
      
      int lowest; 
      lowest = array[row][0];
      
      for (int c = 1; c < array.length; c++) { 
         if (array[row][c] < lowest) { 
           lowest = array[row][c]; 
         }    
      } 
      return lowest; 
   } 
} 



            