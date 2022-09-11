/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phone.book;
import java.util.*;
class maps
{
   static void phone()
   {
       Map<String,String> phone=new HashMap();
        Scanner sc=new Scanner(System.in);
        String name,num;
       int c=0;
        
       while(true)
       {
           System.out.println("\n1-enter\n2-display\n3-fetch entry\n4-delete entry\n5-exit:\n");
           System.out.println("enter choice:");
           c=sc.nextInt();
           String n,k;
           switch(c)
           {
               case 1:System.out.println("enter name:");
                       name=sc.next();
                      System.out.println("enter number:");
                      num=sc.next();
                      phone.put(name, num);
                      break;
               case 2:System.out.println("entries are:\n");
                      for(Map.Entry show:phone.entrySet())
                     {
                       System.out.println(show.getKey()+":"+show.getValue());
                     }
                     break;
               case 3:System.out.println("enter name:");
                      n=sc.next();
                      if(phone.containsKey(n))
                      {
                          System.out.println(n+":"+phone.get(n));
                      }
                      else
                      {
                          System.out.println("entry not found");
                      }
                      break;
               case 4:System.out.println("enter name:");
                      k=sc.next();
                      phone.remove(k);
                      if(phone.containsKey(k))
                      {
                          System.out.println("entry not deleted");
                      }
                      else
                      {
                          System.out.println("entry deleted sucessfully");
                      }
                              
                      break;
               case 5:System.exit(0);
               
                      
           }
           
           
       }
   }
           
}
/**
 *
 * @author Mahum
 */
public class PhoneBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         maps g=new maps();
         g.phone();
        
    }
    
}
