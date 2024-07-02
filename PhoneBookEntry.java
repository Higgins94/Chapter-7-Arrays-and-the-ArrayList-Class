/*

                                                     *Programming Challenge 17*           
      This problem was weird. Challenge said to make five objects with this class, store them in an Array List in the another program (PhoneBook.java in this case),
      then display information there. Seems very poorly optimized and not able to scale. Should have made the Array List in this class to use one object. 
       *Edit* I probably misunderstood the challenge, think I was suppose to have an array of objects - check Challenge 18: TriviaGame class
         for a more in depth demonstration of this concept*
*/ 

/**
   The PhoneBookEntry class holds information relating to a person's name and their phonenumber
*/ 
public class PhoneBookEntry { 

   private String name; 
   private String phoneNumber; 
   
  /**
   Constructor 
  */ 
  
   public PhoneBookEntry() { 
      name = "Not Set"; 
      phoneNumber = "Not Set"; 
  }
  
   /**
     Constructor
     @perma person String for name 
     @perma phoneNum String for phoneNumber
   */ 
   
   public PhoneBookEntry (String person, String phoneNum) { 
      name = person; 
      phoneNumber = phoneNum;
       
   } 
   
   /**
         Constructor
     @perma person String for name 
     @perma phoneNum Int for phoneNumber 
   */ 
   
   public PhoneBookEntry (String person, int phoneNum) { 
      name = person;
      phoneNumber = String.valueOf(phoneNum); 
   } 
   
   /**
     Constructor
     @perma person String for name 
     @perma phoneNum Double for phoneNumber
   */ 
   
   public PhoneBookEntry (String person, double phoneNum) { 
      name = person;
      phoneNumber = String.valueOf(phoneNum); 
   } 
   
   /**
      The setName method sets name field 
      @perma The String for name variable
   */ 
   
   public void setName(String person) { 
      name = person; 
   } 
   
   /**
      The getName method returns name
      @return name The name of the person
   */ 
   
   public String getName() { 
      return name; 
   } 
   
   /**
      The setPhoneNumber method sets the phonenumber field
      @perma phoneNum The String for the phoneNumber
   */ 
   
   public void setPhoneNumber(String phoneNum) { 
      phoneNumber = phoneNum; 
   } 
   
   /**
      The setPhoneNumber method sets the phonenumber field
      @perma phoneNum the Int for the phoneNumber
   */ 
   
   public void setPhoneNumber (int phoneNum) { 
      phoneNumber = String.valueOf(phoneNum); 
   } 
   
   /**
      The setPhoneNumber method sets the phonenumber field
      @perma phoneNum the Double for the phoneNumber
   */ 
   
   public void setPhoneNumber(double phoneNum) { 
      phoneNumber = String.valueOf(phoneNum); 
   } 
   
   /**
      The getPhnoeNumber method return phoneNumber
      @return phoneNumber The person's phoneNumber
   */ 
   
   public String getPhoneNumber() { 
      return phoneNumber; 
  } 
  
} 

   
   
