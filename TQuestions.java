import java.util.Scanner; 
/*
                                     *Programming Challenge 18*
       Working with objects in an array, or in this case I used an ArrayList, was good practice. 
*/

/**
   The TQuestions class holds information pertaining to one trivia question, including destractors and the correct answer
*/ 
public class TQuestions { 
   
   private String question; 
   private String answer1; 
   private String answer2; 
   private String answer3; 
   private String answer4; 
   private double correctAnswer;
   private Scanner scan = new Scanner(System.in);  
      
   /**
      Constructor for no args
   */ 
   
   public TQuestions() { 
      question = "Not Set";
      answer1 = "Not Set";
      answer2 = "Not Set";
      answer3 = "Not Set";
      answer4 = "Not Set";
  } 
  
  /**
   The setQuestion method prompts reads a String and assings to question field
  */ 
 
   public void setQuestion() {
      System.out.print(": "); 
      question = scan.nextLine();  
   } 
   
   /**
      The getQuestion method returns question
      @perma question The value of the String for the question field 
   */ 
   
   public String getQuestion() { 
      return question; 
   } 
   
   /**
      The setAnswer1 method assings a value for answer1 field 
   */ 
   
   public void setAnswer1() { 
      System.out.print("\n\nAnswer #1: "); 
      answer1 = scan.nextLine();   
   } 
   
   /**
      The getAnswer1 method returns answer1
      @return answer1 A possible answer for the question
   */ 
   
   public String getAnswer1() { 
      return answer1; 
   } 
   
    /**
       The setAnswer2 method assings a value for answer2 field
   */ 
   
   public void setAnswer2() { 
      System.out.print("\n\nAnswer #2: "); 
      answer2 = scan.nextLine();  
   } 
   
   /**
      The getAnswer2 method returns answer2
      @return answer2 A possible answer for the question
   */ 
   
   public String getAnswer2() { 
      return answer2; 
   } 
   
    /**
       The setAnswer3 method assings a value for answer3 field
   */ 
   
   public void setAnswer3() { 
      System.out.print("\n\nAnswer #3: "); 
      answer3 = scan.nextLine(); 
   } 
   
   /**
      The getAnswer3 method returns answer3
      @return answer3 A possible answer for the question
   */ 
   
   public String getAnswer3() { 
      return answer3; 
   } 
   
    /**
       The setAnswer4 method reads and assigns value to answer4 field
   */ 
   
   public void setAnswer4() { 
      System.out.print("\n\nAnswer #4: "); 
      answer4 = scan.nextLine(); 
   } 
   
   /**
      The getAnswer method returns answer4
      @return answer4 A possible answer for the question
   */ 
   
   public String getAnswer4() { 
      return answer4; 
   } 
   
   /**
      The setCorrect method will all the user to set which of the four answers is the correct answer
   */ 
   
   public void setCorrect() { 
     System.out.print("\n\nCorrect Answer Number: "); 
     correctAnswer = scan.nextDouble(); 
   } 
   
   /**
      The getCorrect method returns correctAnswer
      @return correctAnswer The answer number that contains the correct respones to the question
   */ 
   
   public double getCorrect() { 
      return correctAnswer; 
   } 
}



   
  
   
   