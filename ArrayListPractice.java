import java.util.ArrayList;
/**
   The ArrayListPractice is just a program I quickly 
   typed up to see the ArrayList class in action for Strings
*/ 
public class ArrayListPractice {
   public static void main(String[] iJustFoundOutYouCanPutAnyThingHere) { 
   
      ArrayList<String> list = new ArrayList<String>(); 
      list.add("This is the first"); 
      list.add("This is the second"); 
      list.add("This is the third"); 
      
      System.out.printf("The size of list is %d" ,list.size()); 
      System.out.printf("\n%s" ,list.get(0)); 
      System.out.printf("\n%s" ,list.get(1)); 
      System.out.printf("\n%s" ,list.get(2));
   } 
}  
      
   
   