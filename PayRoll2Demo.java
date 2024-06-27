import java.util.Scanner; 
/**
               *Programming Challenge 2* 
   The PayRoll2Demo class creates an object from the PayRoll2 class 
   and just validates that those methods work.
   The purpose of this challenge seems to be getting you to work with more than one
   array and design methods that use loops to change element on an array when method is called.
*/ 
public class PayRoll2Demo { 
   public static void main(String[] args) { 
      
      int again = 1, employeeID;
      double wage; 
      Scanner scan = new Scanner(System.in); 
       
      PayRoll2 payroll = new PayRoll2(); 
      payroll.setHours();
      payroll.getHours(); 
      payroll.setPayRate();
      payroll.getPayRate(); 
      
      while (again == 1) { 
         System.out.print("\n\tCalcualte Wage"); 
         System.out.print("\n-----------------------"); 
         System.out.print("\nEnter Employee ID: "); 
         employeeID = scan.nextInt(); 
         wage = payroll.getWage(employeeID);
         System.out.printf("\n%,.2f" ,wage);  
         System.out.print("\n\nAnother Employee?\n1. Yes\n2. No\n"); 
         again = scan.nextInt(); 
      } 
   }
} 
      