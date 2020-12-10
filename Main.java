/*Prince Angulo 
* Lab 7
* Objective: Craete a game where a player plays with a breed of cat of their choosing.
*/


import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      Player p1 = new Player();
      System.out.println("Choose a kitty:");
      System.out.println("1. Tabby Cat");
      System.out.println("2. Ocelot");
      System.out.println("3. Tiger");
      
      int input = getIntRange(1,3);
      System.out.println("Name your kitty: ");
      
      String name = in.nextLine();
      
      if(input == 1)
      {
         Cat kitty = new Tabby(name);
         interactCat(kitty, p1); 
      }
      else if(input == 2)
      {
         Cat kitty = new Ocelot(name);
         interactCat(kitty, p1); 
      }
      else
      {
         Cat kitty = new Tiger(name);
         interactCat(kitty, p1); 
      }
      
   }
   
/* The interactCat method prompts the user to either feed, play with, or pet their cat
*
*  @param Cat c - A cat object whose breed was chosen by the user 
*  @param Player p - A Player object which will keep track of the player's health to see if/when they die
*/  
   public static void interactCat(Cat c, Player p)
   {
      while(p.isDead() == false)
      {  
         System.out.println(p.toString());
         System.out.println(c.toString());
         System.out.println("1. Feed your cat");
         System.out.println("2. Play with your cat");
         System.out.println("3. Pet your cat");
         int input = getIntRange(1,3);
         if(input == 1)
            System.out.println(c.feed(p));
         else if(input == 2)
            System.out.println(c.play(p));
         else 
            System.out.println(c.pet(p));
      }
   }
/*
*  The getIntRange method provides input validation for the menus, will repeatedly run until the user inputs a valid input
*  
*  @param int low - An integer that represents the lowest possible valid input from the user
*  @param int high - An integer that represents the highest possible valid input from the user
*  @return - returns the validated input from the user
*/  

   public static int getIntRange(int low, int high)
   {
      Scanner in = new Scanner(System.in);
      boolean repeat = true;
      int returnVal = 0;
      while (repeat)
      {
         returnVal = 0;
         try
         {
            returnVal = in.nextInt();
            if (returnVal <= high && returnVal >= low)
            {
               repeat = false;
            }
            else
            {
               System.out.println("Invalid Input");
            }
         }catch(InputMismatchException e)
          {
            if (in.hasNext())
            {
               String stuff = in.next();
            }
            System.out.println("Invalid Input");
          }
        
       }
      return returnVal; 
   }
}