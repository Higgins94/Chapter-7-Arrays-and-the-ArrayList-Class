import java.util.Scanner; 
/**
   The ArrayPractice class is for practicing making an array and 
   using that array in a couple for loops in order to call correct 
   elements. 
*/ 
public class ArrayPractice { 
   public static void main(String[] args) { 
      
      int numTest; 
      int test []; 
      
      Scanner scan = new Scanner(System.in); 
      
      System.out.print("How many test would like input? "); 
      numTest = scan.nextInt(); 
      
      int num;
      test = new int [numTest]; 
      
      for (int i = 0; i < test.length; i++) { 
            num = i + 1; 
            System.out.printf("\nEnter score for test number %d: " ,num);
            test[i] = scan.nextInt(); 
      } 
      
      for (int i = 0; i < test.length; i++) { 
         num = i + 1; 
         System.out.printf("\nScore of test %d: %d" ,num, test[i]); 
      } 
   }
}       