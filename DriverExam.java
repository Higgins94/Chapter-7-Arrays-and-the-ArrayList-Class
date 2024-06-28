import java.util.ArrayList; 
/**
   The DriverExam class holds correct answers to a driving test along
   with several fields pertaining to how they did on the test  
*/ 

public class DriverExam { 

   private String[] answers = { "B" ,"D" ,"A" ,"A" ,"C" 
                               ,"A" ,"B" ,"A" ,"C" ,"D" 
                               ,"B" ,"C" ,"D" ,"A" ,"D" 
                               ,"C" ,"C" ,"B" ,"D" ,"A" };
                           
   private int EXAM_QUESTIONS = 20; 
   private int PASSING = 15;
   private String[] student = new String[EXAM_QUESTIONS];
   private ArrayList<String> incorrectQ = new ArrayList<>(); 
   private String result; 
   private int correct;   
   private int incorrect;  
   
   /**
      Constuctor 
      @perma String[] array The array that contains the students answers
   */
   
   public DriverExam(String[] array) {  
      for (int index = 0; index < EXAM_QUESTIONS; index++) { 
         student[index] = array[index]; 
      } 
      correct = 0; 
      setTotalCorrect();
      setPassed();  
      setTotalIncorrect();
      setQuestionsMissed();   
   } 
  
   /**
      The setPassed method calculates if the student passed the driving exam or not  
   */ 
   
   public void setPassed() { 
     
     if (correct >= PASSING) {
      result = "PASSED"; 
     } else { 
      result = "FAILED"; 
     }
  }
  
   /**
      The getPassed method returns passed or failed by comparing students 
      number of correct answers to the passing number qualification  
      @return result The pass or failed state of the student's test
   */ 
  
  public String getPassed() { 
   return result; 
  } 
  
  /**
      The setTotalCorrect method calculates the total numerical value of questions correct
   
  */ 
  
  public void setTotalCorrect() { 
  
      for (int index = 0; index < EXAM_QUESTIONS; index++) { 
         if (student[index].equals(answers[index])) 
            correct++; 
      }   
   } 
   
   /**
      The getTotalCorrect method returns correct
      @return correct The value for the number of answers that were correct
   */
   
   public int getTotalCorrect() { 
      return correct; 
   } 
   
  /**
   The setTotalIncorrect method calculates the total numberical value of questions incorrect
  */ 
  
  public void setTotalIncorrect() { 
   
   incorrect = EXAM_QUESTIONS - correct;  
    
  } 
  
  /**
   The getTotalIncorrect returns incorrect
   @return incorrect The value for the number of answers that were incorrect
  */ 
  
  public int getTotalIncorrect() { 
   return incorrect; 
  } 
  
  /**
     The setQuestionsMissed method keeps an array list of the question numbers the student got incorrect 
  */ 
  
   public void setQuestionsMissed() { 
      int questionNum = 1;
      String arrayInput, validate; 
      for (int index = 0; index < EXAM_QUESTIONS; index++) { 
         if (! student[index].equals(answers[index])) {  
            arrayInput = Integer.toString(questionNum);
            incorrectQ.add(arrayInput);    
         } 
         questionNum++; 
      } 
   } 
   
   /**
   The getQuestionsMissed returns incorrectQ
   @resturn incorrectQ The array list that hold the incorrect question numbers 
   */ 
  
   public ArrayList<String> getQuestionsMissed() { 
      return incorrectQ; 
   } 
} 
         
           
   
   
    
  
  
   
      