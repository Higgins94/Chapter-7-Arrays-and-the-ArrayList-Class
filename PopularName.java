import java.io.*; 
import java.util.ArrayList; 
import java.util.Scanner; 
/*
                     *Programming Challenge 13* 
                   More arrays with files practice 
*/

/**
   The PopularName class shows the rank of a boy's or girl's name from two files containing either the top 
   200 boy or girl names for the year 2024.  
*/

public class PopularName { 
   public static void main(String[] args) throws IOException {  
   
      int menu ,rank ,again = 1;  
  
      Scanner scan = new Scanner(System.in); 
      System.out.print("Popular Name Data Base\n---------------------");
      
      while (again == 1) { 
        
         System.out.print("\n\n\t1. Boy Name \n\t2. Girl Name\n\t3. Both\n\nMenu Selection: "); 
         menu = scan.nextInt();
         while (menu < 1 && menu > 3) { 
            System.out.print("\nInvalid Menu Selection\n1. Boy Name \n2. Girl Name\n3. Both");
             menu = scan.nextInt();
         }  
         
         if (menu == 1) { 
      
            rank = getBoyRank();
            if (rank != 0) 
               System.out.printf("\nPopularity Rank %d" + 
               "\n---------------------" ,rank);
            else 
               System.out.print("\n%s Not Ranked\n---------------------"); 
          }
          
          if (menu == 2) {
            rank = getGirlRank();
             if (rank != 0) 
               System.out.printf("\nPopularity Rank %d" + 
               "\n---------------------" ,rank);
            else 
               System.out.print("\n Not Ranked\n---------------------"); 
          }
          
          if (menu == 3) {
            rank = getGirlRank(); 
             if (rank != 0) 
               System.out.printf("\n Popularity Rank %d" + 
               "\n---------------------" ,rank);
            else 
               System.out.print("\n Not Ranked\n---------------------"); 
           
           rank = getBoyRank();
            if (rank != 0) 
               System.out.printf("\n Popularity Rank %d" + 
               "\n---------------------" ,rank);
            else 
               System.out.print("\n Not Ranked\n---------------------");
          }
          
          System.out.print("\nBack To Menu?\n\n\t1. Yes\n\t2. No\n\nMenu Selection: "); 
          again = scan.nextInt(); 
      }
   } 
              
   /**
      The getBoyRank inputs data from top boy names file to an array list, then 
      compares with the user given name
      @return rank The popularality rank according the file
   */ 
       
   public static int getBoyRank() throws IOException {
    
      ArrayList<String> bNames = new ArrayList<>();
      File fileBoys = new File("Boy Names.txt");
      Scanner scanB = new Scanner(fileBoys); 
 
      String search, name;
      int result;  
      
      while (scanB.hasNext()) { 
         bNames.add(scanB.nextLine()); 
      }
      
      Scanner nameB = new Scanner(System.in);
      System.out.print("\nEnter Boy's Name: "); 
      name = nameB.nextLine(); 
   
      for (int index = 0; index < 200; index++) { 
         search = bNames.get(index); 
         if (search.equalsIgnoreCase(name)) {  
            result = index + 1; 
            return result; 
         } 
      }
      result = 0; 
      return result;  
   }
      
   /**
      The getGirlRank inputs data from top boy names file to an array list, then 
      compares with the user given name
      @return rank The popularality rank according the file

   */ 
   
   public static int getGirlRank() throws IOException { 
      
      File fileGirls = new File("Girl Names.txt"); 
      Scanner scanG = new Scanner(fileGirls); 
      ArrayList<String> gNames = new ArrayList<>();
      String search ,name; 
      
      while (scanG.hasNext()) { 
         gNames.add(scanG.nextLine());
      } 
      
      int result; 
      
      Scanner nameG = new Scanner(System.in);
      System.out.print("\nEnter Girl's Name: "); 
      name = nameG.nextLine(); 
      
      for (int index2 = 0; index2 < gNames.size(); index2++) {
         search = gNames.get(index2);  
            if (search.equalsIgnoreCase(name)) { 
               result = index2 + 1;
               return result;
            }       
      }
      result = 0; 
      return result; 
   }
   
}
               
      
       
    
   
    
   
   
      
      
      