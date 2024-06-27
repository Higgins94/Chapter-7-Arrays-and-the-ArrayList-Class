/**
   The Rainfall class holds values for the amount of rain in a given month for a year
   in an array, methods to get total rainfall, highest rainfall month, lowest rainfall month
*/ 
public class Rainfall { 
   
   private final int MONTHS = 12; 
   private double[] rainfallArray = new double[MONTHS]; 
   
   /**
   No arg Constructor
   */
   
   public Rainfall() { 
   }
  
   /**
      The setRainfall method stores the amount of rainfall for a given month  
      @perma month The numeric representaion of the month in which 
         the rainfall occured in
      @perma rain The amount of rainfall in that month
   */ 
    public void setRainfall(int month, double rain) { 
      int index = month -1; 
      rainfallArray[index] = rain; 
    } 
    
    /**
      The getTotal method calculates the sum of all rainfall 
      @return total amount of rainfall in the year 
    */ 
   public double getTotal() { 
      double total = 0.0; 
      for (int index = 0; index < rainfallArray.length; index++) { 
         total += rainfallArray[index]; 
      } 
      return total;
   } 
   
   /**
      The monthAvg gets the average rainfall per month over the year
      @return monthAvg The value for the average amount of rainfall per month 
   */ 
   
   public double monthAvg() { 
      double monthAvg; 
      double total = getTotal(); 
      monthAvg = total / MONTHS; 
      return monthAvg; 
   } 
   
   /**
      The mostRain method finds and returns the month with the most rain
      @return month The String name of the month with the most rain 
   */ 
   
   public String mostRain() {
      double highest = rainfallArray[0]; 
      int monthNum = 0; 
      String month; 
      for (int index = 1; index < rainfallArray.length; index++) { 
         if (rainfallArray[index] > highest) 
            monthNum = index;  
      } 
      monthNum++; 
      month = getMonth(monthNum);
      return month;  
   } 
   
   /**
      The leastRain method finds and returns the month with the least rain
      @return month The month with the least amount of rainfall 
   */ 
   
   public String leastRain() { 
      double lowest = rainfallArray[0]; 
      int monthNum = 0; 
      String month; 
      for (int index = 1; index < rainfallArray.length; index++) { 
         if (rainfallArray[index] < lowest) 
            monthNum = index;  
      } 
      monthNum++; 
      month = getMonth(monthNum);
      return month; 
   }    
    
   /**
      The getMonth method takes a numeric representation of a month number and 
      converts to a String for that months name
      @return monthName The name of the month 
   */ 
   
   public String getMonth(int monthNum) { 
      String monthName; 
      if (monthNum == 1)  
         monthName = "January";
      else if  (monthNum == 2) 
         monthName = "Febuary"; 
      else if (monthNum == 3) 
         monthName = "March"; 
      else if (monthNum == 4) 
         monthName = "April";
      else if (monthNum == 5) 
         monthName = "May";
      else if (monthNum == 6) 
         monthName = "June";
      else if (monthNum == 7) 
         monthName = "July";
      else if (monthNum == 8) 
         monthName = "August";
      else if (monthNum == 9) 
         monthName = "September";
      else if (monthNum == 10) 
         monthName = "October"; 
      else if (monthNum == 11) 
         monthName = "November";
      else 
         monthName = "December";
      
      return monthName; 
   }  
}        
         
   
 
      
         
    