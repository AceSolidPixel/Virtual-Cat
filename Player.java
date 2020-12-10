public class Player
{
   /** Instance variable for keeping track of the player's HP */
   private int hp;
   
/*
* Constructor for the class, it initializes the player's HP
*/   
   Player()
   {
      hp = 10;
   }
/*
* This method returns the player's HP
* @return - returns the player's HP
*/   
   public int getHp()
   {
      return hp;
   }
/*
* This method deducts any damage taken by the player
*/
   public void takeDamage(int d)
   {
      hp -= d;
   }
/*
* This method checks to see if the player's HP has reached 0 or below
* @return - returns true if the player's HP is below 1
*/
   public boolean isDead()
   {
      if(hp < 1)
      {
         System.out.println("You died! GGWP");
         return true;
      }
      else 
         return false;
   }
/*
* This method returns a message containing the player's HP
* @return getHp - returns the hp value of the player by calling getHP() 
*/   
   public String toString()
   {
      return("You have " + getHp() + "/10 HP");
   }
}