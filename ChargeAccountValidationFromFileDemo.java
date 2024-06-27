import java.util.Scanner; 
import java.io.*;
/**
                 *Programming Challenge 3*
   **The purpose of this challenge is to find and validate a value in a 1d array from a file** 
   
   The ChargeAccountValidationFromFileDemo is the same as ChargeAccountValidation 
   except the account numbers come from a file
*/ 
public class ChargeAccountValidationFromFileDemo { 
   public static void main(String[] args) throws IOException { 
      
      ChargeAccountValidation cav = new ChargeAccountValidation(); 
      Scanner scan = new Scanner(System.in); 
      int accountNum ,result ,index = 1;
      String input; 
      
      System.out.print("File Name:  ");
      input = scan.nextLine();
      File file = new File(input); 
      Scanner fileRead = new Scanner(file); 
         while (fileRead.hasNext()) { 
            input = fileRead.nextLine(); 
            accountNum = Integer.parseInt(input);
            result = cav.validateAccount(accountNum); 
            if (result != -1) { 
               System.out.printf("\nAccount %d: Valid" ,index); 
            } else { 
               System.out.printf("\nAccount %d: Invalid" ,index); 
            }
            index++; 
         }  
         
   } 
}
     
      
