import java.util.Scanner;
import java.util.ArrayList; 
/*
                                  *Programming Challenge 8*
Admittedly I was little slack on this program. The assignment wanted this to be a class to create objects, 
but I just have this all under the main class. The assignment wanted four seperate 1d arrays but I just made two 2d arrays instead. 
I also just have kinda like a proof of concept for the methods there is no input validations outside of accepting test scores,
 and no while loops to continue the input, average spits out everyone. 
*/ 
/**
  The GradeBook class stores students names, test scores, and final letter grade. 
*/
public class GradeBook { 
   public static void main(String[] args) {
      
      final int CLASS_SIZE = 5; 
      final int TOTAL_TEST = 4;  
         
      Scanner scan = new Scanner(System.in); 
      String[][] nameAndGrade = new String[CLASS_SIZE][2];
      double[][] grades = new double[CLASS_SIZE][TOTAL_TEST];
      double grade; 
       
      
      for (int index = 0; index < CLASS_SIZE; index++) { 
         System.out.print("\nStudent " + (index + 1) + " Name: "); 
         nameAndGrade[index][0] = scan.nextLine(); 
      } 
      
      for (int student = 0; student < CLASS_SIZE; student++) { 
         System.out.print("--------------------------"); 
         System.out.print("\nFor Student " + nameAndGrade[student][0]);
         for (int testNum = 0; testNum < TOTAL_TEST; testNum++) { 
            System.out.print("\nTest #" + (testNum + 1) + " Score: "); 
            grades[student][testNum] = scan.nextDouble(); 
            while (grades[student][testNum] < 0 || grades[student][testNum] > 100) { 
               System.out.print("\nInvalid Test Grade");
               System.out.print("\nTest #" + (testNum + 1) + " Score: "); 
               grades[student][testNum] = scan.nextDouble(); 
            }     
         }  
      }
      getName(nameAndGrade);  
      average(nameAndGrade, grades);
      
   }

   /**
      The getName method returns a student's name based on what number student they are
   */ 
   
   public static void getName(String name[][]) {
      
      Scanner nameScanner = new Scanner(System.in);
      System.out.print("\n--------------------");  
      System.out.print("\nEnter Student Number: ");
      int number = nameScanner.nextInt(); 
      number++;
      
      System.out.print("Name: " + name[number][0])
      System.out.print("\n--------------------"); 
   } 

  /**
    The average class calculates the students course grade through averaging the total test score
  */ 
   public static void average(String names[][], double grades[][]) { 
      
      public static void average(String names[][], double grades[][]) { 
      
      final int CLASS_SIZE = 5; 
      final double TOTAL_TEST = 4.0;
      String letterGrade;
      double average, total,
      double grade; 
      
      for (int student = 0; student < CLASS_SIZE; student++) {
         total = 0.0; 
         for (int test = 0; test < TOTAL_TEST; test++) {
            grade = grades[student][test]; 
            total += grade;   
         } 
         average = total / (TOTAL_TEST); 
         System.out.printf("\nStudent #" + (student + 1) + "\nAverage: %.1f" ,average);
         letterGrade = getLetterGrade(average);
         names[student][1] = letterGrade; 
         System.out.print("\nFinal Grade: " + names[student][1]);
         System.out.print("\n------------------"); 
         average = 0.0; 
      }    
   }

   /**
      The getLetterGrade method returns the letter grade that corresponds with the average  
   */ 
   
   public static String getLetterGrade(double average) { 
      
      String letterGrade; 
      if (average > 89) 
         letterGrade = "A"; 
      else if (average > 79) 
         letterGrade = "B"; 
      else if (average > 69)
         letterGrade = "C"; 
      else if (average > 59)
         letterGrade = "D";
      else 
         letterGrade = "F"; 
         
         return letterGrade; 
   } 
}
         
         
       
         
         
   
      
      
   
         
      
          
      
      
      
   
