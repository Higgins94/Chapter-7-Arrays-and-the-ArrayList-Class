import java.util.Scanner; 
/**
                 *Programming Challenge 3*
   **The purpose of this challenge is to find and validate a value in a 1d array** 
   
   The ChargeAccountValidationDemo creates an object with the 
   ChargeAccountValidation class, then validates charge account numbers
   provided by the user
*/ 
public class ChargeAccountValidationDemo { 
   public static void main(String[] args) { 
      
      ChargeAccountValidation cav = new ChargeAccountValidation(); 
      Scanner scan = new Scanner(System.in); 
      int accountNum, again = 1, result; 
       
      while (again == 1) { 
         System.out.print("Enter a charge account number: ");
         accountNum = scan.nextInt();
         result = cav.validateAccount(accountNum); 
         if (result != -1) { 
            System.out.print("\nValid"); 
         } else { 
            System.out.print("\nInvalid"); 
         } 
         System.out.print("\n\nValidate Another Account?\n\t1. Yes\n\t2. No");
         System.out.print("\n\n(1 or 2): ");  
         again = scan.nextInt();
      } 
   }
}      
      
