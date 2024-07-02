import java.util.*; 
/*
                                                     *Programming Challenge 17*           
      This problem was weird. Challenge said to make five objects with the class, store them in an array in this program, then display information. 
         Seems very poorly optimized and not able to scale. Should have made the Array List in the PhoneBookEntry class. 
         *Edit* I probably misunderstood the challenge, think I was suppose to have an array of objects - check Challenge 18: TriviaGame class
         for a more in depth demonstration of this concept*
*/

/**
   The PhoneBook class creates five objects wih the PhoneBookEntry class o recieve user input, 
   then stores the informaton from the five objects into an ArrayList, then displays data to user. 
*/ 

public class PhoneBook { 
   public static void main(String[] args) { 
      
      Scanner scan = new Scanner(System.in); 
      ArrayList<String> phonebook = new ArrayList<>(); 
      final int NAME_PHONENUM_PAIR = 2; 
      String name, phoneNum; 
 
  
      System.out.print("\nEnter Person's Name: "); 
      name = scan.nextLine(); 
      System.out.print("\nEnter " + name + "'s PhoneNumber: ");
      phoneNum= scan.nextLine(); 
      PhoneBookEntry phonebook1 = new PhoneBookEntry(name ,phoneNum);
      phonebook.add(phonebook1.getName()); 
      phonebook.add(phonebook1.getPhoneNumber());  
      
      System.out.print("\nEnter Person's Name: "); 
      name = scan.nextLine(); 
      System.out.print("\nEnter " + name + "'s PhoneNumber: ");
      phoneNum= scan.nextLine(); 
      PhoneBookEntry phonebook2 = new PhoneBookEntry(name ,phoneNum);
      phonebook.add(phonebook2.getName()); 
      phonebook.add(phonebook2.getPhoneNumber());
      
      System.out.print("\nEnter Person's Name: "); 
      name = scan.nextLine(); 
      System.out.print("\nEnter " + name + "'s PhoneNumber: ");
      phoneNum= scan.nextLine(); 
      PhoneBookEntry phonebook3 = new PhoneBookEntry(name ,phoneNum);
      phonebook.add(phonebook3.getName()); 
      phonebook.add(phonebook3.getPhoneNumber());
      
      System.out.print("\nEnter Person's Name: "); 
      name = scan.nextLine(); 
      System.out.print("\nEnter " + name + "'s PhoneNumber: ");
      phoneNum= scan.nextLine(); 
      PhoneBookEntry phonebook4 = new PhoneBookEntry(name ,phoneNum);
      phonebook.add(phonebook4.getName()); 
      phonebook.add(phonebook4.getPhoneNumber());
      
      System.out.print("\nEnter Person's Name: "); 
      name = scan.nextLine(); 
      System.out.print("\nEnter " + name + "'s PhoneNumber: ");
      phoneNum= scan.nextLine(); 
      PhoneBookEntry phonebook5 = new PhoneBookEntry(name ,phoneNum);
      phonebook.add(phonebook5.getName()); 
      phonebook.add(phonebook5.getPhoneNumber());
      
      int counter = -1; 
      int size = phonebook.size()/ 2; 
      
      for (int index = 0; index < size; index++) { 
         counter++; 
         System.out.print("\nName: " + phonebook.get(counter)); 
         counter++; 
         System.out.print(" PhoneNumber: " + phonebook.get(counter)); 
      }
      
   }
} 
            
      
      
      
      
      
       
          
         
