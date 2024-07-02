import java.util.*; 
/*
                                       *Programming Challenge 18*
       Working with objects in an array, or in this case I used an ArrayList, was good practice. 

*/

/**
   The TriviaGame method will populate and ArrayList with 10 objects of the TQuestions class to simulate 10 trivia questions
   The user will input each field of the TQuestions class, then two players will play a trivia game where they will answer five
   questions each and a winner will be declared off who has the most correct responses 
*/ 

public class TriviaGame { 
   public static void main(String[] args) { 
   
      final int MAX_QUESTIONS = 10;
      String player1 ,player2; 
      Scanner scan = new Scanner(System.in);
      ArrayList<TQuestions> trivia = new ArrayList<>();
      
      for (int q = 0; q < MAX_QUESTIONS; q++) { 
         trivia.add(new TQuestions());
      }
      trivia = setQuestions(trivia); 
      System.out.print("\nPlayer 1 Name: "); 
      player1 = scan.nextLine(); 
      System.out.print("\nPlayer 2 Name: "); 
      player2 = scan.nextLine();
      playGame(trivia ,player1 ,player2);  
   } 
   
   /**
      The setQuestions method will prompt the user to input question, answers, and correct answer fields for each of the 
      10 objects held in the ArrayList
      @perma ArrayList<TQuestions> The ArrayList containing the 10 obejects representing the 10 trivia questions
      @return trivia The ArrayList containing the updated fields for each object
   */  
   
   public static ArrayList<TQuestions> setQuestions(ArrayList<TQuestions> trivia) { 
      
      final int MAX_NUM_ANSWERS = 4; 
         
      for (int index = 0; index < trivia.size(); index++) { 
         
         TQuestions question = trivia.get(index);
         System.out.print("\nEnter Trivia Question " + (index + 1));  
         question.setQuestion();
         System.out.print("\nSet Answers");
         
         question.setAnswer1();
         question.setAnswer2();
         question.setAnswer3();
         question.setAnswer4();
         question.setCorrect();  
      }
      return trivia; 
   } 

   /**
      The playGame method will retrieve relevant fields from the objects to compare to the users's inputs 
      in order to simulate a trivia game, most correct answers is the winner
      @perma ArrayList<TQuestions> The ArrayList containing the 10 obejects representing the 10 trivia questions
   */ 
   
   public static void playGame(ArrayList<TQuestions> trivia ,String player1 ,String player2) { 
   
      Scanner scan = new Scanner(System.in);
      
      int answer ,player1W = 0 ,player2W = 0 , i;  
      
      
      for (int index = 0; index < trivia.size() / 2; index++) { 
         
         System.out.printf("\nQuestion " + (index + 1) + " For " + player1);
         System.out.println(""); 
         TQuestions question = trivia.get(index);
         System.out.print("\n" + question.getQuestion() + "\n\t1. " + question.getAnswer1() + " \n\t2. " + 
            question.getAnswer2() + "\n\t3. " + question.getAnswer3() + "\n\t4. " + question.getAnswer4() + "\n\nChoice: ");    
         answer = scan.nextInt(); 
         
         if (answer == question.getCorrect()) { 
               System.out.print("\nCorrect! "); 
               System.out.println("");
               player1W++;
         } else {
            System.out.printf("\nIncorrect!\nCorrect Answer was %,.0f" ,question.getCorrect());
            System.out.println("");
         }
         
         i = index + 1; 
         System.out.print("\nQuestion " + i + " For " + player2);
         System.out.println(""); 
         TQuestions question2 = trivia.get(i);
         System.out.print("\n" + question2.getQuestion() + "\n\t1. " + question2.getAnswer1() + "\n\t2. " + 
            question2.getAnswer2() + "\n\t3. " + question2.getAnswer3() + "\n\t4. " + question2.getAnswer4() + "\n\nChoice: ");    
         answer = scan.nextInt();  
         
         if (answer == question2.getCorrect()) { 
               System.out.print("\nCorrect! ");
               System.out.println(""); 
               player2W++;
            } else {  
               System.out.printf("\nIncorrect!\nCorrect Answer was %.0f"  ,question2.getCorrect());
               System.out.println("");
           } 
      }
      
      System.out.print("\nWith A Total of ");
         if (player1W > player2W) 
            System.out.print(player1W + " Correct Questions, " + player1 + " WINS "); 
         else if (player2W > player1W) 
            System.out.print(player2W + " Correct Questions, " + player2 + " WINS ");
         else 
             System.out.print(player2W + " Correct Questions Each, TIE");
   }
}
         
             
             
                
         
      
      
      
      

      
          
       
         
      
      
  