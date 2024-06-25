/**
   The SalesData class is just for me to practice working with arrays 
   in other classes and retrieving data from an array
*/ 

public class SalesData {

   private double[] sales; 

   /** 
      Constructor 
   */ 

   public SalesData(double[] s) {

      sales = new double[s.length];
   
      for (int i = 0; i < s.length; i++) 
         sales[i] = s[i]; 
   } 
   
   /**
      The getTotal gets the sum of the sales array's elements 
      @return The value for the sum
   */ 
   
   public double getTotal() { 
      
      double total = 0.0;
      
      for (int i = 0; i < sales.length; i++) 
         total += sales[i]; 
      return total;    
   } 
   
   /**
      The getAverage method returns the average 
      of the sale's array
      @return The value for the average of the sale array
   */ 
   
   public double getAverage() { 
   
      return getTotal() / sales.length; 
   } 
   
   /**
      The getHighest method returns the highest element in 
      the sales array
      @return highest The value for the highest element 
   */ 
   
   public double getHighest() { 
      
      double highest = sales[0]; 
      
      for (int i = 1; i < sales.length; i++) { 
      
         if (sales[i] > highest) 
            highest = sales[i]; 
      } 
      return highest;  
   }
   
   /**
      The getLowest method returns the lowest element in 
      the sales array
      @return lowest The value for the lowest element
   
   */ 
   
   public double getLowest() { 
       
       double lowest = sales[0]; 
      
      for (int i = 1; i < sales.length; i++) { 
      
         if (sales[i] <  lowest) 
            lowest= sales[i]; 
      } 
      return lowest;  
   }
   
} 
    
   
     

    
    
 
      
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    