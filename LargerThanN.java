import java.util.Scanner;
/**
                          *Programming Challenge 5*
                *The purpose of the program is more array sorting* 
   The LargerThanN class store inputs of integers into an array, asks for 
   an integer, then prints any number in the array that is larger than said number
*/  

public class LargerThanN { 
   public static void main(String[] args) { 
      
      int array[], n, sizeDeclare, input; 
      Scanner scan = new Scanner(System.in); 
      
      System.out.print("Size of array: "); 
      sizeDeclare = scan.nextInt(); 
      
      array = new int[sizeDeclare]; 
      for (int index = 0; index < array.length; index++) { 
         System.out.print("\nValue for Number " + (index + 1) + ": "); 
         input = scan.nextInt(); 
         array[index] = input; 
      } 
      
      System.out.print("\nEnter value to be compared: "); 
      n = scan.nextInt();
      System.out.println(""); 
      compare(array, n);  
   } 
   
   public static void compare(int[] array2, int n) { 
   
      for (int index = 0; index < array2.length; index++) {
         if (array2[index] > n)  
            System.out.println(array2[index]); 
      } 
   } 
}              
      
      
  
      
      