import javax.swing.JOptionPane; 

/**
   The SalesDataDemo uses the SalesData class to store 
   sales for 7 days, then display average, lowest, and highest
*/ 
public class SalesDataDemo { 
   public static void main(String[] args) { 
      
      final int DAYS = 7; 
      double[] sales = new double[DAYS]; 
      
      getSales(sales);
      
      SalesData week = new SalesData(sales); 
      JOptionPane.showMessageDialog(null,
         String.format("Total Sales: $%,.2f\n" + 
         "Average Sales: $%,.2f\n" + 
         "Highest Sales: $%,.2f\n" + 
         "Lowest Sales: $%,.2f\n", 
          week.getTotal(),
          week.getAverage(), 
          week.getHighest(), 
          week.getLowest())); 
      
      System.exit(0);     
      
   } 
   
   /**
      The getSales methods store the values for week's sales
      in an array
      @perma array The array to store values in
   */ 
   
   public static void getSales(double[] array) { 
      
      String input; 
      
      for (int i = 0; i < array.length; i++) { 
         input = JOptionPane.showInputDialog(
                  "Enter sales for day " + (i + 1) + ": "); 
         array[i] = Double.parseDouble(input); 
      }   
   
   }
}