import javax.swing.JOptionPane; 
/**
   The PayRoll2 class holds three arrays with each element in said arrays pertaining to a 
   particular employee- the location of an employee's ID element in the employeeID array
   will determine where the relevant element is in the other arrays of hours, payRate, and wages (gross pay)
*/ 
public class PayRoll2 { 

   private int[] employeeID = { 5658845 ,4520125 ,7895122
                               ,8777541 ,8451277 ,1302850  
                               ,7580489 };
   
   private int[] hours = new int[7]; 
   private double[] payRate = new double[7]; 
   private double wages[] = new double[7];
   
   /**
      No arg constructor 
   */ 
   
   public PayRoll2() { 
   
   } 
   
   /**
      The setHours class assigns values to all elements in the hours array
   */ 
   
   public void setHours() { 
      
      String input; 
      int hoursInput;
      int id; 
      for (int index = 0; index < employeeID.length; index++) { 
         input = JOptionPane.showInputDialog("For Employee ID: " + employeeID[index] +
                                            "  Enter hours ");
         hoursInput = Integer.parseInt(input);
         while (hoursInput < 0) { 
            JOptionPane.showMessageDialog(null, "Invalid Input. Can Not Have Negative Hours");
            input = JOptionPane.showInputDialog("For Employee ID: " + employeeID[index] +
                                            "  Enter hours ");
            hoursInput = Integer.parseInt(input);
         } 
         hours[index] = hoursInput; 
      } 
   } 
   
   /**
      The getHours value displays all elements in the hours array
   */ 
   
   public void getHours() { 
   
      for (int index = 0; index < hours.length; index++) { 
         JOptionPane.showMessageDialog(null, "Employee ID: " + employeeID[index] +
                                       "  Hours: " + hours[index]); 
      } 
   }
   
   /**
      The setPayRate method assings values to all elements in the payRate array
   */ 
   
   public void setPayRate() { 
      
      String input; 
      double pay; 
      for (int index = 0; index < payRate.length; index++) { 
         input = JOptionPane.showInputDialog("For Employee ID: " + employeeID[index] +
                                            "  Enter Pay Rate ");
         pay = Double.parseDouble(input);
         while (pay < 6.00) { 
            JOptionPane.showMessageDialog(null, "Pay Rates Under $6.00 Will Not Be Accepted"); 
            input = JOptionPane.showInputDialog("For Employee ID: " + employeeID[index] +
                                            "  Enter Pay Rate ");
            pay = Double.parseDouble(input);
         }
          
         payRate[index] = pay;
      } 
   } 
   
   /**
      The getPayRate displays all elements in the payRate array
   */ 
   
    public void getPayRate() { 
      
      for (int index = 0; index < employeeID.length; index++) { 
         JOptionPane.showMessageDialog(null,String.format("For Employee ID: %d   Pay Rate:  $%,.2f  " ,employeeID[index] ,payRate[index]));
      } 
   } 
   
   /**
      The getWage method will calculate the gross pay of a particular employee 
      and assign that value to the appropiate element in the wages array
      @perma employeeiD The employee's ID number who the getWage method will be apllied to
      @return gross The calculated gross pay 
   */ 
   
   public double getWage(int employeeiD) { 
     
     boolean value = false; 
     int num, index = 0;
     double gross = 0000.00; 
     
     for (int i = 0; i < employeeID.length; i++) { 
      num = employeeID[i]; 
      if (num == employeeiD) { 
         value = true; 
         index = i; 
      } 
     } 
     if (value != false) { 
      wages[index] = hours[index] * payRate[index];
      gross = wages[index];
     }
     return gross; 
   } 
} 
      
        

   
     
         
         
       
                                 