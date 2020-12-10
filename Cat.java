public abstract class Cat
{
   /**  String for storing the cat's name */
   private String name;
   /** int that will keep track of how hungry the cat is */
   private int hunger;
/*
* The constructor for this class which initializes both the name and hunger level of the cat
*/      
   public Cat(String n)
   {
      name = n;
      hunger = 5;
   }
/*
* This method returns the name of the cat.
* @return name - returns the name of the cat
*/
   public String getName()
   {
      return name;
   }
/*
* This method returns the hunger level of the cat.
* @return hunger - returns the hunger level of the cat
*/  
   public int getHunger()
   {
      return hunger;
   }
/*
* This method returns the hunger level of the cat and is adjusted if it goes over 10 or below 1
* @param int val - the value of which will be deducted from the cat's hunger level
* @return hunger - return the new hunger level
*/
   protected int incrementHunger(int val)
   {
      hunger += val;
      if(hunger < 1)
         hunger = 1;
      else if(hunger > 10)
         hunger = 10;
      return hunger;
   }
/*
* This method returns a text version of how hungry the cat is
* 
* @return name - returns the name of the cat along with text indicating how hungry the cat is 
*/
   public String toString()
   {
      if(getHunger() < 2)
         return(getName() + " is starving!");
      else if(getHunger() < 5)
         return(getName() + " is hungry.");
      else if(getHunger() < 10)
         return(getName() + " is satisfied.");
      else
         return(getName() + " is full.");
   }
   
   public abstract String feed(Player p);
   
   public abstract String play(Player p);
   
   public abstract String pet(Player p);
   
}


