import java.util.Scanner; 
/*
                                 *Programming Challenge 19* 
   More practice with 2d arrays, again making sure you are visualizing the arrays correctly.
*/
/**
   The LoShuMagicSquare class checks to see if a 3x3 square populated with values form the user make a 
   "Lo Shu Magic Square" which 
*/ 
public class LoShuMagicSquare { 
   public static void main(String[] args) { 
      
      final int SQUARE_LENGTH = 3; 
      int input;
      boolean result;  
      int[][] square = new int[SQUARE_LENGTH][SQUARE_LENGTH]; 
      Scanner scan = new Scanner(System.in); 
      
      for (int row = 0; row < SQUARE_LENGTH; row++) { 
         System.out.print("\n\nFor Row #" + (row + 1) + "\n------------------"); 
         for (int col = 0; col < SQUARE_LENGTH; col++) { 
            System.out.print("\nColumn #" + (col + 1) + " Value: "); 
            square[row][col] = scan.nextInt(); 
            while (square[row][col] < 1 || square[row][col] > 9) { 
               System.out.print("\nValues Must Be In Range of 1 - 9" + 
                  "\nColumn #" + (col + 1) + " Value: "); 
               square[row][col] = scan.nextInt(); 
            }        
         }
      } 
      
      result = magicOrNot(square);
      System.out.print("\n\nLo Shu Magic Square Status: " + result); 
   } 
   
   /**
      The magicOrNot method checks to see if the user's square is indeed a magic square
      by checking the sum or the appropiate elements to see if they equal 15 or not
      @perma square The 2d array that cotains the square to be checked
      @return result the boolean status of if the square is magic or not
   */ 
   
   public static boolean magicOrNot(int[][] square) { 
      
      final int magicNum = 15; 
      int sum;
      boolean result = false; 
      
      for (int r = 0; r < square.length; r++) { 
         sum = 0;
         for(int c = 0; c < square[r].length; c++) { 
            sum += square[r][c]; 
         }
         if (sum != magicNum) 
            return result; 
      } 
      
      for (int col = 0; col < square.length; col++) { 
         sum = 0; 
         for (int row = 0; row < square.length; row++) { 
            sum += square[row][col]; 
         } 
         if (sum != magicNum)  
            return result; 
      } 
      
     sum = 0; 
     
     sum = square[0][0] + square[1][1] + square[2][2]; 
      if (sum != magicNum)  
            return result; 
     sum = 0;
     sum = square[0][2] + square[1][1] + square[2][0];
     if (sum != magicNum)  
            return result;
     result = true;
     return result; 
   }
}
      
 
     
     
         
          
            
                