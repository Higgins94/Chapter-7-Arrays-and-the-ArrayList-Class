/**
   The ChargeAccountValidation method holds an array of valid charge accounts 
   and a method to determine if an account, passed as an argument, is a valid charge account
*/ 
public class ChargeAccountValidation { 

   int[] accounts = { 5658845 ,4520125 ,7895122 ,8777541 ,8451277
                     ,1302850 ,8080152 ,4562555 ,5552012 ,5050552 
                     ,7825877 ,1250255 ,1005231 ,6545231 ,3852085 
                     ,7576651 ,7881200 ,4581002 };
   
   private int searchAccount;
   
   /**
      No arg Constructor 
   */  
   
   public ChargeAccountValidation() { 
   
   }
   
   /**
      The validateAccount method first implements a selection sort on the array, then validates 
      the account by performing a binary search
      This is over kill for a 1d array search. 
      @perma searchValue The account to be validated 
      @return postion The element postion of a valid account number, set to -1 as default to indicate 
      no valid element postion found 
   */ 
   
   public int validateAccount(int searchValue) { 
   
      int startScan ,index ,minIndex ,minValue, first ,last ,middle ,postion; 
      boolean found;
      first = 0; 
      last = accounts.length -1; 
      postion = -1; 
      found = false;   
   
      for (startScan = 0; startScan < (accounts.length-1); startScan++) { 
         minIndex = startScan; 
         minValue = accounts[startScan]; 
         for (index = startScan + 1; index < accounts.length; index++) { 
            if (accounts[index] < minValue) { 
               minValue =accounts[index]; 
               minIndex = index; 
            }
         }
         accounts[minIndex] = accounts[startScan]; 
         accounts[startScan] = minValue; 
      }
      
      while (!found && first <= last) { 
         middle = (first + last) / 2; 
         if (accounts[middle] == searchValue) { 
            found = true; 
            postion = middle; 
         } else if (accounts[middle] > searchValue) { 
            last = middle -1; 
         } else { 
            first = middle + 1; 
         }   
      } 
      return postion;     
   }
}