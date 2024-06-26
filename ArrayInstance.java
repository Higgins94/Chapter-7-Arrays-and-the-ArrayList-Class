import java.util.Scanner; 
/**
   The ArrayInstance class is just practicing creating an array of Objects
   using the SavingAccount class (found in Chapter 6 repositorie)
*/ 
public class ArrayInstance { 
   public static void main(String[] args) { 
   
      final int NUM_ACCOUNTS = 2; 
      SavingAccount[] accounts  = new SavingAccount[NUM_ACCOUNTS]; // Object array, null values 
   
      createAccounts(accounts); 
      System.out.print("\n\tAfter One Month"); 
      System.out.print("\n-----------------------"); 
      for(int index = 0; index < accounts.length; index++) { 
         System.out.printf("\n Account " + 
            (index + 1) + " Balance: $%,.2f" ,accounts[index].getBalance()); 
      } 
      
   } 
   
   public static void createAccounts(SavingAccount[] accounts) { //The method arg here creates a new reference point to find 
                                                                // the Object array created in main, when you pass that array as   
      Scanner scan = new Scanner(System.in);                    // as the arg. What you call this array is "functionally" irrelevant
      int i = 0;
      for (int index = 0; index < accounts.length; index++) { 
        double interestR = 0.0, balance = 0.0; 
        i++; 
        System.out.printf("\nEnter annual interest rate for account %d: ",i);
        interestR = scan.nextDouble(); 
        System.out.printf("\nEnter starting balance amount for account %d: $",i);
        balance = scan.nextDouble();  
        accounts[index] = new SavingAccount(interestR, balance);
      }
   }
} 