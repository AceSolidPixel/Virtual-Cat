public class Tabby extends Cat
{
/*
* The constructor for this class
*/
   public Tabby(String n)
   {
      super(n);
   }
/*
* This method returns whether if the Tabby Cat is full, or if they eat, because they aren't
*
* @param Player p - A Player object that is passed, just in case damage needs to be calculated
* @return gatName - returns a String so that the player knows what happened in response to trying to feed the cat
*/    
   @Override
   public String feed(Player p)
   {
      if(getHunger() == 10)
      {
         p.takeDamage(2);
         return(getName() + " is already full, and bites and scratches you for insulting them with food. You take 2 damage.");
      }
      else
      {
         incrementHunger(10); 
         return(getName() + " is pretty hungry, and starts chomping down the food right away.");
      }
   }
/*
* This method returns whether if the Tabby Cat feels like playing with the player 
* or not and whether or not the player is hurt by the Tabby Cat.
*
* @param Player p - A Player object that is passed, just in case damage needs to be calculated
* @return getName - returns a String so that the player knows what happened in response to trying to feed the cat
*/    
   @Override
   public String play(Player p)
   {
      if(getHunger() <= 2)
      {
         incrementHunger(-1);
         p.takeDamage(2);
         return(getName() + " is very hungry, " + getName() + " attacked you. You take 2 damage.");   
      }
      else if(getHunger() < 5)
      {
         incrementHunger(-1);
         return(getName() + " is a little hungry, so they are unwilling to play.");
      }
      else
      {
         incrementHunger(-1);
         return(getName() + " plays with a thread of string that you dangle in front of them.");
      }
   }
/*
* This method returns whether if the Tabby Cat feels like playing with the player 
* or not and whether or not the player is hurt by the Tabby Cat.
*
* @param Player p - A Player object that is passed, just in case damage needs to be calculated
* @return getName - returns a String so that the player knows what happened in response to trying to feed the cat
*/   
   @Override
   public String pet(Player p)
   {
      if(getHunger() == 1)
      {
         incrementHunger(-1);
         p.takeDamage(3);
         return(getName() + " is starving! It greatly lashes out! You take 3 damage.");
      }
      else if(getHunger() < 5)
      {  
         incrementHunger(-1);
         p.takeDamage(2);
         return(getName() + " is hungry and lashed out at you. You take 2 damage.");
      }
      else if(getHunger() < 10)
      {
         incrementHunger(-1);
         return(getName() + " is not hungry, so they happily let you pet them.");
      }
      else
      {
         incrementHunger(-1);
         return(getName() + " is full and fell asleep as you were petting them.");
      }
   }
}