import java.util.Scanner; 
/*
                                             Programming Challenge #7
                  Working with a 2d array now, this program was the most fun to make so far. 
                  I probably should have made a method just for input validations because they are all over 
                  the place and were not required by the problem; I always go overkill on these challenges though.
                  I chose not to have methods call other methods : each method is self sustainable : allows for scale
*/

/**
   The QuarterlySalesStatistics store sales numbers for six division across four quarters in a 2d array. 
   Methods will accomplish getting total sales per quarter, increase or decrease between quarter totals, 
   average sales for each division, the total amount of sales for a division, comparing a division's sales from last quarter,
   and displaying the divsion with the highest sales
  
*/ 
public class QuarterlySalesStatistics { 
   public static void main(String[] args) {
   
      final int NUM_OF_DIVISIONS = 6; 
      final int QUARTER_SIZE = 4; 
      Scanner scan = new Scanner(System.in); 
      double[][] sales = new double[QUARTER_SIZE][NUM_OF_DIVISIONS];
      double input, total, again, menu1, menu2; 
      
// Sales Inputs 
      for(int qrt = 0; qrt < QUARTER_SIZE; qrt++) { 
         System.out.print("\nFor Quarter: " + (qrt + 1));

         for (int div = 0; div < NUM_OF_DIVISIONS; div++) { 
            System.out.print("\nDivision " + (div + 1) + ": $"); 
            input = scan.nextDouble();

            while (input < 0) { 
               System.out.print("\nInvalid Input\nFor Quarter:" + (qrt + 1) +  
                  "\nQuarter " + (div + 1) + ": $"); 
               input = scan.nextDouble();
            }

            sales[qrt][div] = input;
         }
       }
       System.out.print("\n\n-----------------------------");
       totalQrt(sales); 
       System.out.print("\n-----------------------------"); 
       compareQrts(sales);
       System.out.print("\n-----------------------------"); 
       average(sales);
       System.out.print("\n-----------------------------");
       highest(sales);
       System.out.print("\n-----------------------------");
        
// Menu For Sales Per Division
      System.out.print("\n\nList Sales Figures By Division\n\n1. Yes\n2. No"); 
      System.out.print("\n(1 or 2): "); 
      again = scan.nextDouble();
      
      while (again != 1 && again != 2) { 
         System.out.print("\nInvalid Input");
         System.out.print("\nList Sales Figures By Division\n\n1. Yes\n2. No"); 
         System.out.print("\n(1 or 2): "); 
         again = scan.nextDouble(); 
      } 
      if (again == 1) { 
         salesPerDiv(sales); 
         again = 0; 
      }
      again = 1; 
// Menu For Difference For Division From Previous Quarter
      while (again == 1) { 
         System.out.print("\nCompare a Division's Sales Between Quarters\n\n1. Yes\n2. No"); 
         System.out.print("\n(1 or 2): "); 
         again = scan.nextDouble();
      
         while (again != 1 && again != 2) { 
            System.out.print("\nInvalid Input");
            System.out.print("\nCompare a Division's Sales Between Quarters\n\n1. Yes\n2. No"); 
            System.out.print("\n(1 or 2): "); 
            again = scan.nextDouble();
         } 
         if (again == 1)
            compareDivPerQrt(sales);
         } 
         System.out.print("\n\nHave A Pleasent Day Human");  
   } 
   
   /**
      The salesPerDiv method will calculate and display the total sales for a 
      division across all four qrts
   */ 
   
   public static void salesPerDiv(double[][] sales) {    
      
      Scanner salesD = new Scanner(System.in); 
      
      final int NUM_OF_DIVISIONS = 6;
      final int QUARTER_SIZE = 4;  
      int div, again = 1; 
      double total = 0.0; 
      

      while (again == 1) { 
         System.out.print("\nEnter Division: "); 
         div = salesD.nextInt();
         
         while (div < 0 && div > NUM_OF_DIVISIONS) { 
            System.out.print("\nInvalid Input");
            System.out.print("\nEnter Division: "); 
            div = salesD.nextInt(); 
         }
         div--;
         
             
         total = 0.0; 
         for (int quarter = 0; quarter < QUARTER_SIZE; quarter++) { 
            total += sales[quarter][div]; 
         } 
         
         System.out.print("Total Sales for Division " + div + ": $" + total);
         System.out.print("\n-----------------------------"); 
         System.out.print("\nAnother Division\n\n1. Yes\n2. No");
         System.out.print("\n(1 or 2): ");
         again = salesD.nextInt(); 
         
         while (again != 1 && again != 2) { 
            System.out.print("\nInvalid Input");
            System.out.print("\nAnother Division\n\n1. Yes\n2. No");
            System.out.print("\n(1 or 2): ");  
            again = salesD.nextInt();
         }
         if (again == 2) 
            return;  
      }
 
   }
   
   /**
      The compareDivPerQrt will compare how a division's sales were from last quarter
   */ 
   
   public static void compareDivPerQrt(double[][] sales) {  
   
      Scanner compare = new Scanner(System.in); 
      final int NUM_OF_DIVISIONS = 6;
      final int QUARTER_SIZE = 4; 
      int div, counter = 2;
      double base ,total, difference;  
      
      System.out.print("\nEnter Division: ");
      div = compare.nextInt(); 
      
      while (div < 0 && div > NUM_OF_DIVISIONS) { 
            System.out.print("\nInvalid Input");
            System.out.print("\nEnter Division: ");
            div = compare.nextInt();
      }
      div--;
      base = sales[0][div]; 
      
      for (int index = 1; index < QUARTER_SIZE; index++) {
         
         difference = sales[index][div] - base;
         System.out.printf("\nFrom Q" + index +" to Q" + (index + 1) + ": Difference: $(%,.2f)" ,difference );
         base = sales[index][div]; 
      }
      System.out.print("\n-----------------------------");
   }   
      
    /**
      The compareQrts will calculate and display the company's increase or decrease from previous quarter
    */     
    
    public static void compareQrts(double[][] sales) { 
    
      
      final int NUM_OF_DIVISIONS = 6; 
      final int QUARTER_SIZE = 4;
      double total, difference;  
      
     double base = sales[0][0] + sales[0][1] + sales[0][2] + sales[0][3] + sales[0][4] + sales[0][5]; 
     System.out.print("\nIncrease or Decrease From Previous Quarter"); 
    
      for (int qrt = 1; qrt < QUARTER_SIZE; qrt++) { 
         total = 0.0;
         difference = 0.0;  
         for (int div = 0; div < NUM_OF_DIVISIONS; div++) {
            total += sales[qrt][div]; 
         } 
         difference = total - base;  
         System.out.printf("\nFrom Q" + (qrt) + " to Q" + (qrt + 1) + ": $ %,.2f" ,difference);
         base = total; 
      } 
   }
 
   /**
   The totalQrt method will calculate and display total sales for a quarter 
   */
   public static void totalQrt(double[][] sales) { 
   
     final int NUM_OF_DIVISIONS = 6; 
     final int QUARTER_SIZE = 4;
     double total =  0.0; 
     System.out.print("\nTotal Sales Per Quarter");
      
     for (int qrt = 0; qrt < QUARTER_SIZE; qrt++) { 
       total = 0.0; 
       for (int div = 0; div < NUM_OF_DIVISIONS; div++) {
         total += sales[qrt][div]; 
       } 
       System.out.printf("\nQ" + (qrt + 1) + ": $%,.2f" ,total); 
     } 
   } 
   
   /**
   The average method will calculate the average sale for all divisions across quarters
   */
   public static void average(double[][] sales) { 
      
     final double NUM_OF_DIVISIONS = 6.0; 
     final int QUARTER_SIZE = 4;
     double total =  0.0, average;
     System.out.print("\nAverage Sale Per Division");  
      
     for(int div = 0; div < NUM_OF_DIVISIONS; div++) { 
      total = 0.0; 
      for (int qrt = 0; qrt < QUARTER_SIZE; qrt++) { 
         total += sales[qrt][div];
      }
     
       average = total / NUM_OF_DIVISIONS; 
       System.out.printf("\nD" + (div + 1) + ": avg. $%,.2f" ,average);  
     } 
   } 

  /**
  The highest method will calculate and display the division with highest total sales
  */ 

    public static void highest(double[][] sales) { 
   
      final int NUM_OF_DIVISIONS = 6; 
      final int QUARTER_SIZE = 4;
      double total = 0.0, highest;
      int number;  

      highest = sales[0][0] + sales[1][0] + sales[2][0] + sales[3][0];
      number = 1; 
     
     for (int div = 1; div < NUM_OF_DIVISIONS; div++) { 
    
       for (int qrt = 0; qrt < QUARTER_SIZE; qrt++) {
         total += sales[qrt][div];
       } 
       if (total > highest) {   
         highest = total;
         number = div + 1; 
       }
       total = 0.0;
      
     }
      
      System.out.printf("\nHighest Sales Division: %d\nSales: $%,.2f" ,number, highest); 
    } 
}
   
   