import java.util.Scanner;
/**
   The ArrayDemo class is my first time coding a very basic array
*/

public class ArrayDemo { 
   public static void main(String[] args) { 
   
      final int FINAL_NUMBER = 3; 
   
      Scanner scan = new Scanner(System.in);
      int[] numbers = new int[FINAL_NUMBER]; 
      
      System.out.print("\nEnter the first number: "); 
      numbers[0] = scan.nextInt(); 
   
      System.out.print("\nEnter the first number: "); 
      numbers[1] = scan.nextInt(); 
    
      System.out.print("\nEnter the first number: "); 
      numbers[2] = scan.nextInt(); 
      
      System.out.println(); 
      System.out.println(numbers[0]);
      System.out.println(numbers[1]);
      System.out.println(numbers[2]); 
   }
} 