/**
   The ArrayPassToMethod class is for practicing passing an array as 
   an argument to another method
*/ 
public class ArrayPassToMethod { 
   public static void main(String[] args) { 
   
      int [] array = {5 ,10 ,30 ,42 ,55 ,66 ,72};
      
      for (int i = 0; i < array.length; i++) { 
         PassVaraible(array[i]);
      }
      System.out.println(""); 
      PassObject(array);  
   } 
   
   /**
      The PassVaraiable method receieves the array's individual elements as an arg
      @perma number The variable to pass the array element to 
   */ 
   public static void PassVaraible(int number) { 
      System.out.print(number + " "); 
   }
   /**
      The PassObject method receives the entire array as an arg
      @perma An array argument
   */ 
   public static void PassObject(int[] array) { 
      
      for (int i = 0; i < array.length; i++)  
         System.out.print(array[i] + " ");  
   } 
}  
