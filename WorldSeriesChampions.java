import java.util.ArrayList; 
import java.util.Scanner; 
import java.io.*; 

/*
                                  *Programming Challenge 15*
 Feel like they are beating a dead horse with this challenge, hence why everything is real quick in the main. Arrays from file inputs 
                     
*/ 

/**
   The WorldSeriesChampions class stores data from a file containting a list of World Series 
   winners from 2023 back to 1903 minus the two times there was no World Series. Prompts user for team
   displays how many times won. 
*/ 
public class WorldSeriesChampions  {
   public static void main(String[] args) throws IOException { 
       
   
      final int BASE_YEAR = 2023;
      int won = 0;   
      String input ,user; 
 
      ArrayList<String> teams = new ArrayList<>(); 
      ArrayList<Integer> years = new ArrayList<>(); 
      Scanner scan = new Scanner(System.in); 
   
      File file = new File("WSWinners.txt"); 
      Scanner scanFile = new Scanner(file); 
   
      while (scanFile.hasNext()) { 
         input = scanFile.nextLine(); 
         teams.add(input);
      }
   
      System.out.print("\nEnter Team Name: ");
      user = scan.nextLine();
   
      for (int index = 0; index < teams.size(); index++) {
         input = teams.get(index); 
         if (input.equalsIgnoreCase(user)) { 
            won++; 
            years.add(BASE_YEAR - index); 
         } 
      }
       
      System.out.print("\nWorld Series Wins: " + won); 
      if (won > 0) { 
         System.out.print("\nYears: "); 
         for (int i = 0; i < years.size(); i++) { 
            System.out.print(years.get(i) + " "); 
         }
      }
   }
} 
       
   


