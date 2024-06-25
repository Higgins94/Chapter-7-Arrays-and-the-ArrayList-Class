/**
   The ArrayPassToMethod class is for practicing passing an array as 
   an argument to another method
*/ 
public class ArrayPassToMethod { 
   public static void main(String[] args) { 
   
      int [] array = {1 ,2 ,3 ,4 ,5 ,6 ,7};
      
      for (int i = 0; i < array.length; i++) { 
         Pass(i); 
      } 
   } 
   
   /**
      The Pass method receieves the array as an argument
      @perma number The varaible to pass the array element to 
   */ 
   public static void Pass(int number) { 
      System.out.print(number + " "); 
   }
}  