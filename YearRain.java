import java.util.Scanner; 
/**
                        *Programming Challenge # 1*
   The YearRain class creates an object with the Rainfall class to store and 
   display data relating the amount of rainfall per month in a given year. 
   The purpose of this challenge is just o incorporate an array learned from this chapter 
   to another class to make an object to store values / display data.
*/ 
public class YearRain { 
   public static void main(String[] args) { 
      
      Scanner scan = new Scanner(System.in); 
      
      final int MONTHS = 12; 
      double rainfall; 
      String monthName;
      Rainfall yearRain = new Rainfall(); 
      
      for (int month = 1; month <= MONTHS; month++) { 
         System.out.printf("\nInches of Rainfall for month %d: " ,month); 
         rainfall = scan.nextDouble(); 
         while (rainfall < 0) { //Input validation 
            System.out.print("\nInvalid Input");
            System.out.printf("\nInches of Rainfall for month %d: " ,month); 
            rainfall = scan.nextDouble(); 
         }  
         yearRain.setRainfall(month ,rainfall); 
     } 
     System.out.print("\n----------------------"); 
     System.out.printf("Total Rainfall for Year: %,.2f\n " + 
                       "Monthly Average: %,.2f\n" + 
                       "Month with Lease Rain: %s\n" + 
                       "Month with Most Rain: %s", 
                       yearRain.getTotal(), 
                       yearRain.monthAvg(), 
                       yearRain.leastRain(), 
                       yearRain.mostRain()); 
    }
}
             