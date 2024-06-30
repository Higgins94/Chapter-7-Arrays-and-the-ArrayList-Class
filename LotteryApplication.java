import java.util.Random; 
/*
                                       *Programming Challenge 10*
  With all the class methods I find it makes more sense to have no return value if that return value will just be used 
  to display information to the user. I just have the method be void and handle all the output. 
*/

/**
   The LotteyApplication class creates a random lottery ticket stored in an array then compares to a user's array to 
   simulate a lottey
*/ 
public class LotteryApplication { 
  
   final int LOTTERYT_NUMBER_AMOUNT = 5;
   private int number;  
   private int[] lotteryNumbers = new int[LOTTERYT_NUMBER_AMOUNT];
  
  /**
   No arg constructor
  */ 
  
   public LotteryApplication() { 
   
      for (int index = 0 ; index < LOTTERYT_NUMBER_AMOUNT; index++) {  
         Random rand = new Random();
         number = rand.nextInt(10) + 0; 
         lotteryNumbers[index] = number; 
      } 
   }
      
   /**
      The getLotteryNumber method displays the lottery ticket numbers that are stored in the 
      lotteryNumbers array
   */ 
   
   public void getLotteryNumbers() { 
   
      System.out.print("\nWinning Lottery Ticket Numbers: ");  
      for (int index = 0 ; index < LOTTERYT_NUMBER_AMOUNT; index++) {  
  
         System.out.print(" " + lotteryNumbers[index]); 
      } 
   }
   
   /**
      The compare class compares the user's array to the randomly generated array from the constructor, 
      display the postions of the elements that match and total number of matching
      @perma user The int array that holds the lottery tickets for the user
   */ 
   
   public void compare(int[] user) { 
      
      int count = 0; 
      for (int index = 0 ; index < LOTTERYT_NUMBER_AMOUNT; index++) {  
         
         if (user[index] == lotteryNumbers[index]) {
         System.out.print("\nPostion " + (index + 1) + ": Match");
         count++; 
         } else { 
            System.out.print("\nPostion " + (index + 1) + ": No Match"); 
         } 
      }
      System.out.print("\n----------------------------");
      System.out.print("\nTotal Positions Matched: " + count);
   } 
}    
 
      
   
    
   
  
   