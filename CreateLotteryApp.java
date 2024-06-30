import java.util.Scanner; 

/*
                                       *Programming Challenge 10*
      Very simple program to show off very simple class, this was probably the easiest challenge of this chapter so far
*/

/**
   The CreateLotteryApp class prompts the user to enter numbers for a lottery ticket, an object is
   then created with the LotteryApplication class to compare and display results */ 

public class CreateLotteryApp { 
   public static void main(String[] args) { 
      
      Scanner scan = new Scanner(System.in); 
      
      final int LOTTERYT_NUMBER_AMOUNT = 5;
      int[] user = new int[LOTTERYT_NUMBER_AMOUNT];
      
      
      for (int index = 0 ; index < LOTTERYT_NUMBER_AMOUNT; index++) {   
         System.out.print("\nEnter Number for Ticket Postion " + (index + 1) + ": "); 
         user[index] = scan.nextInt();  
      } 
      
      LotteryApplication lotto = new LotteryApplication(); 
      lotto.compare(user); 
      System.out.print("\n-------------------------------");
      lotto.getLotteryNumbers();
      System.out.print("\n-------------------------------");
       System.out.print("\nYour Ticket Numbers: ");
       
       
      for (int i = 0; i < LOTTERYT_NUMBER_AMOUNT; i++) { 
         System.out.print(" " + user[i]); 
      } 
   } 
} 
      
