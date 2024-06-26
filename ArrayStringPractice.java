
/**
   The ArrayStringPractice method is just practice for working with 
   an array that has Strings 
*/ 
public class ArrayStringPractice { 
   public static void main(String[] args) { 
   
      String[] array = {"Mercury" ,"Venus" ,"Earth" ,"Mars"}; 
      
      for (int index = 0; index < array.length; index++) { 
         System.out.print(array[index] + " "); 
      } 
      System.out.println(""); 
      for (int i = 0; i < array.length; i++) { 
         System.out.print(array[i].charAt(0) + " ");
      }
   }
}  
         
      