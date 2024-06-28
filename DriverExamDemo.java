import java.util.Scanner; 
import java.util.ArrayList; 
/*
                      *Programming Challenge #6* 
     More practice with arrays, increased number of arrays than previous problems
      Do not know if I was suppose to implement an array list but I found that 
          to be the easiest solution to getting incorrect questions
 
*/ 
/**       
   The DriveExamDemo class stores the answers from a student in an array then 
   DriverExam class is called to create an object to display data
*/ 

public class DriverExamDemo { 
   public static void main (String[] args) { 
   
   
      String questionAnswer;
      final int EXAM_QUESTIONS = 20; 
      int questionNum = 1; 
      char c; 
      String[] studentExam = new String[EXAM_QUESTIONS];
      
      Scanner scan = new Scanner(System.in); 
      
      
      for (int index = 0; index < EXAM_QUESTIONS; index++) { 
         
         System.out.print("\nAnswer for Qustion " + (questionNum) + ": "); 
         questionAnswer = scan.nextLine();
         c = questionAnswer.charAt(0);

         while (c != 'A' && c != 'B' && c != 'C' && c != 'D') { 
            System.out.print("\nInvalid Input"); 
            System.out.print("\nAnswer for Qustion " + (questionNum) + ": "); 
            questionAnswer = scan.nextLine();
            c = questionAnswer.charAt(0);
         } 
            questionNum++;
            questionAnswer = Character.toString(c);
            studentExam[index] = questionAnswer; 
      } 
      
      DriverExam test1 = new DriverExam(studentExam);
       
      System.out.println(""); 
      System.out.print(test1.getPassed());
      System.out.printf("\nTotal Correct: %d \nTotal Incorrect: %d " 
         ,test1.getTotalCorrect(), test1.getTotalIncorrect());
      System.out.print("\n_____________________________");
      System.out.println("");
      ArrayList <String> incorrectQuestions = new ArrayList<>(); // The array list to hold return from Driver Exam method 
      incorrectQuestions = test1.getQuestionsMissed(); 
      
      //Outputs
      for (int q = 0; q < incorrectQuestions.size(); q++) { 
         System.out.print("Question Number: " + incorrectQuestions.get(q) + " Incorrect\n"); 
      }
      System.out.print("\n_____________________________"); 
      System.out.printf("\nYour Answers ");  
      for (int i = 0; i < EXAM_QUESTIONS; i++) { 
         System.out.print("Q." + (i + 1) + " " + studentExam[i]); 
         System.out.println(""); 
      }  
   }
} 
       
          
               
          
      
      
      
      